package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investment")
public class InvestmentController implements CRUDController<InvestmentRequest, InvestmentResponse> {


    @Override
    public ResponseEntity<InvestmentResponse> create(InvestmentRequest investmentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<InvestmentResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<InvestmentResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<InvestmentResponse> update(InvestmentRequest investmentRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}
