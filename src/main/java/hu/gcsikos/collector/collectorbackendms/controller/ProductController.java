package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController implements CRUDController<ProductRequest, ProductResponse> {


    @Override
    public ResponseEntity<ProductResponse> create(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ResponseEntity<ProductResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<ProductResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<ProductResponse> update(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}