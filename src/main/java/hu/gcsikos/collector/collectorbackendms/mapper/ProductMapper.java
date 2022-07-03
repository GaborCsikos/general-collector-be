package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class ProductMapper implements Mapper<ProductRequest, ProductResponse, Product> {


    @Override
    public ProductResponse mapFromEntityToResponse(Product mapFrom) {
        ProductResponse response = new ProductResponse();
        BeanUtils.copyProperties(mapFrom, response);
        return response;
    }

    @Override
    public Product updateEntity(Product original, ProductRequest updateFrom) {
        BeanUtils.copyProperties(updateFrom, original, "id");
        original.setUpdatedAt(OffsetDateTime.now());
        return original;
    }

    @Override
    public Product createEntity(ProductRequest createFrom) {
        Product response = new Product();
        BeanUtils.copyProperties(createFrom, response);
        response.setCreatedAt(OffsetDateTime.now());
        response.setId(null);
        return response;
    }
}
