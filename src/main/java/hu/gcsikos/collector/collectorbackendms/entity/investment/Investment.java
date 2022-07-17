package hu.gcsikos.collector.collectorbackendms.entity.investment;

import hu.gcsikos.collector.collectorbackendms.entity.product.Currency;
import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Entity
@Table(name = "investment")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Investment extends CreatedAndUpdatedEntity {


    @Column(name = "investment", nullable = false)
    private BigDecimal investment;

    @Column(name = "currency", nullable = false)
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "invested_at")
    private OffsetDateTime investedAt;

    // TODO relationship
}
