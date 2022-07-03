package hu.gcsikos.collector.collectorbackendms.unit.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import hu.gcsikos.collector.collectorbackendms.helper.ProductHelper;
import hu.gcsikos.collector.collectorbackendms.mapper.ProductMapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class ProductMapperTest {


    @InjectMocks
    private ProductMapper productMapper;

    @Test
    public void mapFromEntityToResponse() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Product product = ProductHelper.createSavedProduct(10L, createdAt, updatedAt);


        //WHEN
        ProductResponse response = productMapper.mapFromEntityToResponse(product);

        //THEN
        assertEquals(10L, response.getId());
        assertEquals(createdAt, response.getCreatedAt());
        assertEquals(updatedAt, response.getUpdatedAt());
    }

    @Test
    public void updateEntity() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Product product = ProductHelper.createSavedProduct(10L, createdAt, updatedAt);
        ProductRequest productRequest = ProductHelper.createProductRequest();

        //WHEN
        Product response = productMapper.updateEntity(product, productRequest);

        //THEN
        assertEquals(10L, response.getId());
        assertEquals(createdAt, response.getCreatedAt());
        assertNotEquals(updatedAt, response.getUpdatedAt());
    }

    @Test
    public void createEntity() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        ProductRequest productRequest = ProductHelper.createProductRequest();


        //WHEN
        Product response = productMapper.createEntity(productRequest);

        //THEN
        assertNull(response.getId());
        assertNull(response.getUpdatedAt());
    }

}