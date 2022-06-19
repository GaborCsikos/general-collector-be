package hu.gcsikos.collector.collectorbackendms.repository.investment;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
