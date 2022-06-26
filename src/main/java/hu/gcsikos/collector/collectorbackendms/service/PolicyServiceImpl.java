package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.request.generic.PolicyRequest;
import hu.gcsikos.collector.collectorbackendms.response.PolicyResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.PolicyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Override
    public PolicyResponse create(PolicyRequest policyRequest) {
        return null;
    }

    @Override
    public PolicyResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<PolicyResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public PolicyResponse update(PolicyRequest policyRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
