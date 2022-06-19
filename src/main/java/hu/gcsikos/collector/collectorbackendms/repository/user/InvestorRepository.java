package hu.gcsikos.collector.collectorbackendms.repository.user;

import hu.gcsikos.collector.collectorbackendms.entity.user.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Seller, Long> {
}
