package hu.gcsikos.collector.collectorbackendms.response;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.general.AbstractResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentResponse extends AbstractResponse {
    private BigDecimal investment;
    private Currency currency;
    private OffsetDateTime investedAt;
}
