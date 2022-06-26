package hu.gcsikos.collector.collectorbackendms.repository.product;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
