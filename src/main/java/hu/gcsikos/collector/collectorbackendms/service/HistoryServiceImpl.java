package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.request.generic.HistoryRequest;
import hu.gcsikos.collector.collectorbackendms.response.HistoryResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.HistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {
    @Override
    public HistoryResponse create(HistoryRequest historyRequest) {
        return null;
    }

    @Override
    public HistoryResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<HistoryResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public HistoryResponse update(HistoryRequest historyRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
