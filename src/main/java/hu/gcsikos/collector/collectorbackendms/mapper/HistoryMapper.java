package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.history.History;
import hu.gcsikos.collector.collectorbackendms.response.HistoryResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class HistoryMapper {

    public HistoryResponse mapFromEntityToResponse(History mapFrom) {
        HistoryResponse response = new HistoryResponse();
        BeanUtils.copyProperties(mapFrom, response);
        return response;
    }

}
