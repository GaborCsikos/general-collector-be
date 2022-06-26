package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.InvestmentRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import org.springframework.stereotype.Component;

@Component
public class InvestmentMapper implements Mapper<InvestmentRequest, InvestmentResponse, Investment, InvestmentRequestForCreate> {

    @Override
    public InvestmentResponse mapFromEntityToResponse(Investment investment) {
        return null;
    }

    @Override
    public Investment updateEntity(Investment original, InvestmentRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public Investment createEntity(InvestmentRequest toCreate) {
        return null;
    }
}

