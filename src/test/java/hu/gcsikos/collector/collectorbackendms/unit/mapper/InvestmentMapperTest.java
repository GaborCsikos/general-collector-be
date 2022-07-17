package hu.gcsikos.collector.collectorbackendms.unit.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import hu.gcsikos.collector.collectorbackendms.helper.InvestmentHelper;
import hu.gcsikos.collector.collectorbackendms.mapper.InvestmentMapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class InvestmentMapperTest {


    @InjectMocks
    private InvestmentMapper investmentMapper;

    @Test
    public void mapFromEntityToResponse() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Investment Investment = InvestmentHelper.createSavedInvestment(10L, createdAt, updatedAt);


        //WHEN
        InvestmentResponse response = investmentMapper.mapFromEntityToResponse(Investment);

        //THEN
        assertEquals(10L, response.getId());
        assertEquals(createdAt, response.getCreatedAt());
        assertEquals(updatedAt, response.getUpdatedAt());
    }

    @Test
    public void updateEntity() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        Investment investment = InvestmentHelper.createSavedInvestment(10L, createdAt, updatedAt);
        InvestmentRequest investmentRequest = InvestmentHelper.createInvestmentRequest();

        //WHEN
        Investment response = investmentMapper.updateEntity(investment, investmentRequest);

        //THEN
        assertEquals(10L, response.getId());
        assertEquals(createdAt, response.getCreatedAt());
        assertNotEquals(updatedAt, response.getUpdatedAt());
    }

    @Test
    public void createEntity() {
        //GIVEN
        OffsetDateTime createdAt = OffsetDateTime.now();
        OffsetDateTime updatedAt = OffsetDateTime.now();
        InvestmentRequest investmentRequest = InvestmentHelper.createInvestmentRequest();


        //WHEN
        Investment response = investmentMapper.createEntity(investmentRequest);

        //THEN
        assertNull(response.getId());
        assertNull(response.getUpdatedAt());
    }

}