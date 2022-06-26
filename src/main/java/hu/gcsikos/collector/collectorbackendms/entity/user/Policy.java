package hu.gcsikos.collector.collectorbackendms.entity.user;

import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "policy")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@MappedSuperclass
public class Policy extends CreatedAndUpdatedEntity {

    @Column(name = "number_of_max_cancellation", nullable = false)
    private Integer numberOfMaxCancellation;

    @Column(name = "min_of_suspension", nullable = false)
    private Integer minutesOfSuspension;
}
