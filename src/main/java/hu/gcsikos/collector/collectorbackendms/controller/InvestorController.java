package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investor")
public class InvestorController implements CRUDController<InvestorRequest, InvestorResponse> {


    @Override
    public ResponseEntity<InvestorResponse> create(InvestorRequest investorRequest) {
        return null;
    }

    @Override
    public ResponseEntity<InvestorResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<InvestorResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<InvestorResponse> update(InvestorRequest investorRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}
