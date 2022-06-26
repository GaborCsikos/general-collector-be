package hu.gcsikos.collector.collectorbackendms.entity.history;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.OffsetDateTime;


@Entity
@Table(name = "history")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class History {

    @CreatedDate
    @Column(name = "history_when", nullable = false, updatable = false)
    protected OffsetDateTime historyWhen;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
