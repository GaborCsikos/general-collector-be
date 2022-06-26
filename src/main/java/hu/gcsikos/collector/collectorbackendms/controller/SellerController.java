package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.SellerRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.SellerResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController implements CRUDController<SellerRequest, SellerResponse> {


    @Override
    public ResponseEntity<SellerResponse> create(SellerRequest sellerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<SellerResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<SellerResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<SellerResponse> update(SellerRequest sellerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}
