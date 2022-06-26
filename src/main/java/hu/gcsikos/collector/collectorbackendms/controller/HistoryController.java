package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.HistoryRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.HistoryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class HistoryController implements CRUDController<HistoryRequest, HistoryResponse> {


    @Override
    public ResponseEntity<HistoryResponse> create(HistoryRequest historyRequest) {
        return null;
    }

    @Override
    public ResponseEntity<HistoryResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<HistoryResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<HistoryResponse> update(HistoryRequest historyRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}
