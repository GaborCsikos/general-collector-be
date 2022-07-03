package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Policy;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.PolicyRequest;
import hu.gcsikos.collector.collectorbackendms.response.PolicyResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class PolicyMapper implements Mapper<PolicyRequest, PolicyResponse, Policy> {


    @Override
    public PolicyResponse mapFromEntityToResponse(Policy mapFrom) {
        PolicyResponse response = new PolicyResponse();
        BeanUtils.copyProperties(mapFrom, response);
        return response;
    }

    @Override
    public Policy updateEntity(Policy original, PolicyRequest toUpdate) {
        BeanUtils.copyProperties(toUpdate, original, "id");
        original.setUpdatedAt(OffsetDateTime.now());
        return original;
    }

    @Override
    public Policy createEntity(PolicyRequest toCreate) {
        Policy response = new Policy();
        BeanUtils.copyProperties(toCreate, response);
        response.setCreatedAt(OffsetDateTime.now());
        return response;
    }
}
