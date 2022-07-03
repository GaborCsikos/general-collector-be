package hu.gcsikos.collector.collectorbackendms.response;

import hu.gcsikos.collector.collectorbackendms.entity.history.HistoryEntity;
import hu.gcsikos.collector.collectorbackendms.general.AbstractResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;

@Getter
@Setter
@ToString
public class HistoryResponse extends AbstractResponse {

    private OffsetDateTime historyWhen;
    private String historyEvent;
    private Long historyWhoId;
    private Long historyWhatId;
    private HistoryEntity historyEntity;

}
