package hu.gcsikos.collector.collectorbackendms.entity.user;

import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


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


}
