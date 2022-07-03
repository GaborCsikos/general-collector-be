package hu.gcsikos.collector.collectorbackendms.helper;

import hu.gcsikos.collector.collectorbackendms.entity.history.History;
import hu.gcsikos.collector.collectorbackendms.entity.history.HistoryEntity;

import java.time.OffsetDateTime;

import static hu.gcsikos.collector.collectorbackendms.entity.history.HistoryEntity.SELLER;

public final class HistoryHelper {

    public static final OffsetDateTime HISTORY_WHEN = OffsetDateTime.now();
    public static final String HISTORY_EVENT = "Entity updated";
    public static final Long HISTORY_WHO_ID = 1L;
    public static final Long HISTORY_WHAT_ID = 2L;
    public static final HistoryEntity HISTORY_ENTITY = SELLER;

    private HistoryHelper() {

    }

    public static History createHistory() {
        History history = History.builder().historyWhen(HISTORY_WHEN).historyEntity(HISTORY_ENTITY)
                .historyWhoId(HISTORY_WHO_ID).historyWhatId(HISTORY_WHAT_ID)
                .historyEvent(HISTORY_EVENT)
                .build();
        return history;
    }


    public static History createSavedHistory(Long id, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        History history = HistoryHelper.createHistory();
        history.setId(id);
        history.setCreatedAt(createdAt);
        history.setUpdatedAt(updatedAt);
        return history;
    }

}
