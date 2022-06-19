package hu.gcsikos.collector.collectorbackendms.config;

import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAdvice.class);
    @Value("${translate.error.general.message}")
    private String generalError;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GenericResponse> handleGeneric(Exception ex) {
        LOGGER.error("Generic error:", ex);
        return ResponseEntity.badRequest().body(GenericResponse.builder().message(generalError).build());
    }

}