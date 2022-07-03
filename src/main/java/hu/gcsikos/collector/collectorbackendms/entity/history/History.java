package hu.gcsikos.collector.collectorbackendms.entity.history;

import hu.gcsikos.collector.collectorbackendms.general.CreatedAndUpdatedEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import java.time.OffsetDateTime;


@Entity
@Table(name = "history")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class History extends CreatedAndUpdatedEntity {

    @CreatedDate
    @Column(name = "history_when", nullable = false, updatable = false)
    private OffsetDateTime historyWhen;

    @Column(name = "value", nullable = false)
    private String historyEvent;

    @Column(name = "history_who_id", nullable = false)
    private Long historyWhoId;

    @Column(name = "history_what_id", nullable = false)
    private Long historyWhatId;

    @Column(name = "history", nullable = false)
    @Enumerated(EnumType.STRING)
    private HistoryEntity historyEntity;
}
