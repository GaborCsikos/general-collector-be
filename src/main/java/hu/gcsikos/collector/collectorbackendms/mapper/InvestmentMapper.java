package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.investment.Investment;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class InvestmentMapper implements Mapper<InvestmentRequest, InvestmentResponse, Investment> {

    @Override
    public InvestmentResponse mapFromEntityToResponse(Investment mapFrom) {
        InvestmentResponse response = new InvestmentResponse();
        BeanUtils.copyProperties(mapFrom, response);
        return response;
    }

    @Override
    public Investment updateEntity(Investment original, InvestmentRequest toUpdate) {
        BeanUtils.copyProperties(toUpdate, original, "id");
        original.setUpdatedAt(OffsetDateTime.now());
        return original;
    }

    @Override
    public Investment createEntity(InvestmentRequest toCreate) {
        Investment response = new Investment();
        BeanUtils.copyProperties(toCreate, response);
        response.setCreatedAt(OffsetDateTime.now());
        return response;
    }
}

