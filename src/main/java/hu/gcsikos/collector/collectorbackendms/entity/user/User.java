package hu.gcsikos.collector.collectorbackendms.entity.user;

import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;


@Entity
@Table(name = "user")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@MappedSuperclass
public abstract class User extends CreatedAndUpdatedEntity {

    @Column(name = "suspended_till")
    protected OffsetDateTime suspendedTill;
    @Column(name = "activePolicy")
    protected Policy activePolicy;
    @Column(name = "external_user_id", nullable = false)
    private String externalUserId;
    @Column(name = "suspended", nullable = false)
    @ColumnDefault("false")
    private Boolean suspended;

}
