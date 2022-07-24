package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.exception.GenericException;
import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investor")
public class InvestorController implements CRUDController<InvestorRequest, InvestorResponse> {


    @Autowired
    private InvestorService investorService;

    // Just service
    @Override
    public ResponseEntity<InvestorResponse> create(InvestorRequest investorRequest) {
        InvestorResponse response = investorService.create(investorRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // ADMIN
    @Override
    public ResponseEntity<InvestorResponse> getById(Long id) {
        InvestorResponse response = investorService.getById(id);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // ADMIN
    @Override
    public Page<InvestorResponse> listElements(Pageable pageable) {
        Page<InvestorResponse> response = investorService.listElements(pageable);
        if (response == null) {
            throw new GenericException();
        }
        return response;
    }

    // OWN
    @Override
    public ResponseEntity<InvestorResponse> update(InvestorRequest investorRequest) {
        InvestorResponse response = investorService.update(investorRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    // OWN
    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        boolean response = investorService.delete(id);
        if (!response) {
            throw new GenericException();
        }
        return new ResponseEntity<>(GenericResponse.builder().message(CRUDController.DELETED).build(),
                HttpStatus.NO_CONTENT);
    }
}
