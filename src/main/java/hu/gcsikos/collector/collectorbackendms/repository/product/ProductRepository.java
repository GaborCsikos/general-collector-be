package hu.gcsikos.collector.collectorbackendms.repository.product;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
