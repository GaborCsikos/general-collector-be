package hu.gcsikos.collector.collectorbackendms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Profile("test")
@Configuration
@EnableWebSecurity
public class LocalWebSecurityConfig {


  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http.cors().disable() // NO CORS

            .authorizeRequests().anyRequest().permitAll()//PERMIT ALL

            // CSRF
            .and()
            .csrf()
            .disable().build();
  }


}
