package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.ProductRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<ProductRequest, ProductResponse, Product, ProductRequestForCreate> {


    @Override
    public ProductResponse mapFromEntityToResponse(Product product) {
        return null;
    }

    @Override
    public Product updateEntity(Product original, ProductRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public Product createEntity(ProductRequest toCreate) {
        return null;
    }
}
