package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.exception.GenericException;
import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// TODO just own investments can be CRUD by seller
@RestController
@RequestMapping("/investment")
public class InvestmentController implements CRUDController<InvestmentRequest, InvestmentResponse> {

    @Autowired
    private InvestmentService investmentService;

    @Override
    public ResponseEntity<InvestmentResponse> create(InvestmentRequest investmentRequest) {
        InvestmentResponse response = investmentService.create(investmentRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<InvestmentResponse> getById(Long id) {
        InvestmentResponse response = investmentService.getById(id);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public Page<InvestmentResponse> listElements(Pageable pageable) {
        Page<InvestmentResponse> response = investmentService.listElements(pageable);
        if (response == null) {
            throw new GenericException();
        }
        return response;
    }

    @Override
    public ResponseEntity<InvestmentResponse> update(InvestmentRequest investmentRequest) {
        InvestmentResponse response = investmentService.update(investmentRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        boolean response = investmentService.delete(id);
        if (!response) {
            throw new GenericException();
        }
        return new ResponseEntity<>(GenericResponse.builder().message(CRUDController.DELETED).build(),
                HttpStatus.NO_CONTENT);
    }
}
