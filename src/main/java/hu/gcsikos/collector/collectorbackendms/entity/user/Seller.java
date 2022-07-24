package hu.gcsikos.collector.collectorbackendms.entity.user;

import hu.gcsikos.collector.collectorbackendms.entity.product.Product;
import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name = "seller")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seller extends CreatedAndUpdatedEntity {

    @Column(name = "external_user_id", nullable = false)
    private String externalUserId;

    @OneToMany
    @JoinColumn(name = "id") // product id
    @LazyCollection(LazyCollectionOption.TRUE)
    private List<Product> products;

}
