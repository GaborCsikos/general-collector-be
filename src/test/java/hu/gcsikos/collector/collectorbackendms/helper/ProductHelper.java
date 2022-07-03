package hu.gcsikos.collector.collectorbackendms.helper;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import hu.gcsikos.collector.collectorbackendms.entity.product.ProductType;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public final class ProductHelper {

    public static ProductType PRODUCT_TYPE = ProductType.ART;
    public static Currency CURRENCY = Currency.EURO;
    public static String DESCRIPTION = "Description";
    public static String NAME = "name";
    public static BigDecimal MAX_VALUE = BigDecimal.ZERO;

    private ProductHelper() {

    }

    public static Product createProduct() {
        Product product = Product.builder().productType(PRODUCT_TYPE).currency(CURRENCY).description(DESCRIPTION)
                .maxValue(MAX_VALUE).name(NAME)
                .build();
        return product;
    }

    public static ProductRequest createProductRequest() {
        ProductRequest product = ProductRequest.builder().productType(PRODUCT_TYPE).currency(CURRENCY).description(DESCRIPTION)
                .maxValue(MAX_VALUE).name(NAME)
                .build();
        return product;
    }


    public static Product createSavedProduct(Long id, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        Product product = ProductHelper.createProduct();
        product.setId(id);
        product.setCreatedAt(createdAt);
        product.setUpdatedAt(updatedAt);
        return product;
    }

}
