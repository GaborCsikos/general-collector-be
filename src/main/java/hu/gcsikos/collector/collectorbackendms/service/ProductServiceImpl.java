package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public ProductResponse create(ProductRequest productRequest) {
        return null;
    }

    @Override
    public ProductResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<ProductResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ProductResponse update(ProductRequest productRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
