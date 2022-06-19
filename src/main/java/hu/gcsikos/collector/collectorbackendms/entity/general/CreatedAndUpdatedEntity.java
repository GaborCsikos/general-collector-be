package hu.gcsikos.collector.collectorbackendms.entity.general;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * Generic entity to store createdAt and updatedAt field
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class CreatedAndUpdatedEntity implements Serializable {
    public static final long serialVersionUID = 1L;
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    protected OffsetDateTime createdAt;
    @LastModifiedDate
    @Column(name = "updated_at")
    protected OffsetDateTime updatedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

