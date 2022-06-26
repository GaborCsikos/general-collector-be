package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.history.History;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.HistoryRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.HistoryRequest;
import hu.gcsikos.collector.collectorbackendms.response.HistoryResponse;
import org.springframework.stereotype.Component;

@Component
public class HistoryMapper implements Mapper<HistoryRequest, HistoryResponse, History, HistoryRequestForCreate> {
    @Override
    public HistoryResponse mapFromEntityToResponse(History history) {
        return null;
    }

    @Override
    public History updateEntity(History original, HistoryRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public History createEntity(HistoryRequest toCreate) {
        return null;
    }
}
