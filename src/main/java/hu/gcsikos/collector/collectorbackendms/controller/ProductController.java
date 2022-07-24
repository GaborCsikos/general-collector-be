package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.exception.GenericException;
import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// https://stackoverflow.com/questions/51712724/how-to-allow-a-user-only-access-their-own-data-in-spring-boot-spring-security
// Just own for seller
@RestController
@RequestMapping("/product")
public class ProductController implements CRUDController<ProductRequest, ProductResponse> {


    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<ProductResponse> create(ProductRequest productRequest) {
        ProductResponse response = productService.create(productRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ProductResponse> getById(Long id) {
        ProductResponse response = productService.getById(id);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public Page<ProductResponse> listElements(Pageable pageable) {
        Page<ProductResponse> response = productService.listElements(pageable);
        if (response == null) {
            throw new GenericException();
        }
        return response;
    }

    @Override
    public ResponseEntity<ProductResponse> update(ProductRequest productRequest) {
        ProductResponse response = productService.update(productRequest);
        if (response == null) {
            throw new GenericException();
        }
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        boolean response = productService.delete(id);
        if (!response) {
            throw new GenericException();
        }
        return new ResponseEntity<>(GenericResponse.builder().message(CRUDController.DELETED).build(),
                HttpStatus.NO_CONTENT);
    }
}
