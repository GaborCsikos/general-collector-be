package hu.gcsikos.collector.collectorbackendms.entity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "investor")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@MappedSuperclass
public abstract class Investor extends User {


}
