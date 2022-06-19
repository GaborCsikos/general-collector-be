package hu.gcsikos.collector.collectorbackendms.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GenericResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
}
