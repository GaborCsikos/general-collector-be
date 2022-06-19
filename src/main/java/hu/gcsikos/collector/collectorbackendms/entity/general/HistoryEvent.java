package hu.gcsikos.collector.collectorbackendms.entity.general;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public enum HistoryEvent {
    SELLER_CREATE_CF, SELLER_DELETE_CF, SELLER_UPDATE_CF, INVESTOR_INVEST_TO_CF, INVESTOR_DELETE_CF, INVESTOR_UPDATE_CF, ADMIN_CHANGED
}
