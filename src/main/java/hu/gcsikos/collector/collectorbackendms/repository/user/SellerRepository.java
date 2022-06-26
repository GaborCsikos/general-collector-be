package hu.gcsikos.collector.collectorbackendms.repository.user;

import hu.gcsikos.collector.collectorbackendms.entity.user.Seller;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SellerRepository extends PagingAndSortingRepository<Seller, Long> {
}
