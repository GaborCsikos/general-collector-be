package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Investor;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.InvestorRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import org.springframework.stereotype.Component;

@Component
public class InvestorMapper implements Mapper<InvestorRequest, InvestorResponse, Investor, InvestorRequestForCreate> {

    @Override
    public InvestorResponse mapFromEntityToResponse(Investor investor) {
        return null;
    }

    @Override
    public Investor updateEntity(Investor original, InvestorRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public Investor createEntity(InvestorRequest toCreate) {
        return null;
    }
}
