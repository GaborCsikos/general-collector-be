package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.exception.GenericException;
import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.SellerRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.SellerResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController implements CRUDController<SellerRequest, SellerResponse> {

    @Autowired
    private SellerService sellerService;


    // Just service
    @Override
    public ResponseEntity<SellerResponse> create(SellerRequest sellerRequest) {
        SellerResponse response = sellerService.create(sellerRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // OWN
    @Override
    public ResponseEntity<SellerResponse> getById(Long id) {
        SellerResponse response = sellerService.getById(id);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // ADMIN
    @Override
    public Page<SellerResponse> listElements(Pageable pageable) {
        Page<SellerResponse> response = sellerService.listElements(pageable);
        if (response == null) {
            throw new GenericException();
        }
        return response;
    }

    // OWN
    @Override
    public ResponseEntity<SellerResponse> update(SellerRequest sellerRequest) {
        SellerResponse response = sellerService.update(sellerRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    // OWN
    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        boolean response = sellerService.delete(id);
        if (!response) {
            throw new GenericException();
        }
        return new ResponseEntity<>(GenericResponse.builder().message(CRUDController.DELETED).build(),
                HttpStatus.NO_CONTENT);

    }
}
