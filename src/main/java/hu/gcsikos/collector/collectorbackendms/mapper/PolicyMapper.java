package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Policy;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.PolicyRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.PolicyRequest;
import hu.gcsikos.collector.collectorbackendms.response.PolicyResponse;
import org.springframework.stereotype.Component;

@Component
public class PolicyMapper implements Mapper<PolicyRequest, PolicyResponse, Policy, PolicyRequestForCreate> {


    @Override
    public PolicyResponse mapFromEntityToResponse(Policy policy) {
        return null;
    }

    @Override
    public Policy updateEntity(Policy original, PolicyRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public Policy createEntity(PolicyRequest toCreate) {
        return null;
    }
}
