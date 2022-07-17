package hu.gcsikos.collector.collectorbackendms.helper;

import hu.gcsikos.collector.collectorbackendms.entity.history.HistoryEntity;
import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import hu.gcsikos.collector.collectorbackendms.entity.product.ProductType;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;

import java.time.OffsetDateTime;

import static hu.gcsikos.collector.collectorbackendms.entity.history.HistoryEntity.SELLER;

public final class InvestmentHelper {

    public static final ProductType PRODUCT_TYPE = ProductType.LOAN;
    public static final String HISTORY_EVENT = "Entity updated";
    public static final Long HISTORY_WHO_ID = 1L;
    public static final Long HISTORY_WHAT_ID = 2L;
    public static final HistoryEntity HISTORY_ENTITY = SELLER;

    private InvestmentHelper() {

    }

    public static Investment createInvestment() {
        Investment product = Investment.builder()
                .build();
        return product;
    }

    public static InvestmentRequest createInvestmentRequest() {
        InvestmentRequest product = InvestmentRequest.builder()
                .build();
        return product;
    }


    public static Investment createSavedInvestment(Long id, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        Investment investment = InvestmentHelper.createInvestment();
        investment.setId(id);
        investment.setCreatedAt(createdAt);
        investment.setUpdatedAt(updatedAt);
        return investment;
    }

}
