package hu.gcsikos.collector.collectorbackendms.response;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.general.AbstractResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class InvestorResponse extends AbstractResponse {
    private BigDecimal investment;
    private Currency currency;
}
