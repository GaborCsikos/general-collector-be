package hu.gcsikos.collector.collectorbackendms.request.generic;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.general.AbstractRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
@ToString
public class InvestmentRequest extends AbstractRequest {

    private Long id;
    private BigDecimal investment;
    private Currency currency;
    private OffsetDateTime investedAt;
}
