package hu.gcsikos.collector.collectorbackendms.controller;

import hu.gcsikos.collector.collectorbackendms.general.CRUDController;
import hu.gcsikos.collector.collectorbackendms.request.generic.PolicyRequest;
import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import hu.gcsikos.collector.collectorbackendms.response.PolicyResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController implements CRUDController<PolicyRequest, PolicyResponse> {


    @Override
    public ResponseEntity<PolicyResponse> create(PolicyRequest policyRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PolicyResponse> getById(Long id) {
        return null;
    }

    @Override
    public Page<PolicyResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<PolicyResponse> update(PolicyRequest policyRequest) {
        return null;
    }

    @Override
    public ResponseEntity<GenericResponse> delete(Long id) {
        return null;
    }
}
