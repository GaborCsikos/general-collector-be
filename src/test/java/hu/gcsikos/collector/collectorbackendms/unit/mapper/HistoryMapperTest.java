package hu.gcsikos.collector.collectorbackendms.unit.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.history.History;
import hu.gcsikos.collector.collectorbackendms.helper.HistoryHelper;
import hu.gcsikos.collector.collectorbackendms.mapper.HistoryMapper;
import hu.gcsikos.collector.collectorbackendms.response.HistoryResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HistoryMapperTest {


    @InjectMocks
    private HistoryMapper historyMapper;

    @Test
    public void mapFromEntityToResponse() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        History history = HistoryHelper.createSavedHistory(10L, createdAt, updatedAt);

        //WHEN
        HistoryResponse response = historyMapper.mapFromEntityToResponse(history);

        //THEN
        assertEquals(10L, response.getId());
        assertEquals(createdAt, response.getCreatedAt());
        assertEquals(updatedAt, response.getUpdatedAt());

        assertEquals(HistoryHelper.HISTORY_EVENT, response.getHistoryEvent());
        assertEquals(HistoryHelper.HISTORY_WHAT_ID, response.getHistoryWhatId());
        assertEquals(HistoryHelper.HISTORY_WHO_ID, response.getHistoryWhoId());
        assertEquals(HistoryHelper.HISTORY_WHEN, response.getHistoryWhen());
        assertEquals(HistoryHelper.HISTORY_ENTITY, response.getHistoryEntity());
    }


}