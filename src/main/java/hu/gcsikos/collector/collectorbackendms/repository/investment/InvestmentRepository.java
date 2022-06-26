package hu.gcsikos.collector.collectorbackendms.repository.investment;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InvestmentRepository extends PagingAndSortingRepository<Investment, Long> {
}
