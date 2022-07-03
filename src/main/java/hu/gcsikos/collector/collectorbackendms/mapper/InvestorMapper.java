package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Investor;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class InvestorMapper implements Mapper<InvestorRequest, InvestorResponse, Investor> {

    @Override
    public InvestorResponse mapFromEntityToResponse(Investor fromMap) {
        InvestorResponse response = new InvestorResponse();
        BeanUtils.copyProperties(fromMap, response);
        return response;
    }

    @Override
    public Investor updateEntity(Investor original, InvestorRequest toUpdate) {
        BeanUtils.copyProperties(toUpdate, original, "id");
        original.setUpdatedAt(OffsetDateTime.now());
        return original;
    }

    @Override
    public Investor createEntity(InvestorRequest toCreate) {
        Investor response = new Investor();
        BeanUtils.copyProperties(toCreate, response);
        response.setCreatedAt(OffsetDateTime.now());
        return response;
    }
}
