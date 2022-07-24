package hu.gcsikos.collector.collectorbackendms.entity.user;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
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
@Table(name = "investor")
@ToString
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@MappedSuperclass
public class Investor extends CreatedAndUpdatedEntity {

    @Column(name = "external_user_id", nullable = false)
    private String externalUserId;

    @OneToMany
    @JoinColumn(name = "id") // investment id
    @LazyCollection(LazyCollectionOption.TRUE)
    private List<Investment> investments;
}
