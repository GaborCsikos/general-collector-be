package hu.gcsikos.collector.collectorbackendms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Profile("!test")
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {


  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http.cors().and()
            .headers()
            .xssProtection()
            .and()
            .contentSecurityPolicy("script-src 'self'").and()
            .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.GET, "/actuator/health").permitAll()    // needed by Consul for Service Discovery
            .antMatchers(HttpMethod.GET, "/actuator/info").permitAll()      // needed by us for version checking
            .antMatchers("/actuator/**").hasRole("actuator_admin")          // all other Actuator endpoints
            .anyRequest().authenticated()

            // CSRF
            .and()
            .csrf()
            .disable().build();
  }


  @Bean
  public CorsConfigurationSource corsConfigurationSource(CorsConfiguration corsConfiguration) {
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", corsConfiguration);
    return source;
  }

  @Bean
  public CorsConfiguration corsConfiguration() {
    CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
    // For development only
    configuration.setAllowedOrigins(
            Arrays.asList("http://localhost:9000", "http://localhost:3333")); // ALLOWED ORIGINS
    configuration.addAllowedMethod(HttpMethod.PUT);
    configuration.addAllowedMethod(HttpMethod.DELETE);
    return configuration;
  }


}
