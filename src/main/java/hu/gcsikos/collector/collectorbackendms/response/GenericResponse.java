package hu.gcsikos.collector.collectorbackendms.response;

import hu.gcsikos.collector.collectorbackendms.general.AbstractResponse;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GenericResponse extends AbstractResponse {

    private String message;
}
