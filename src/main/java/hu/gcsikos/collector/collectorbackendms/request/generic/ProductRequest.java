package hu.gcsikos.collector.collectorbackendms.request.generic;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.entity.product.ProductType;
import hu.gcsikos.collector.collectorbackendms.general.AbstractRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;


@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest extends AbstractRequest {
    private Long id;

    private String name;
    private String description;
    private BigDecimal maxValue;
    private Currency currency;
    private ProductType productType;
}
