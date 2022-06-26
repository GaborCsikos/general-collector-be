package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.InvestorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InvestorServiceImpl implements InvestorService {


    @Override
    public InvestorResponse create(InvestorRequest investorRequest) {
        return null;
    }

    @Override
    public InvestorResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<InvestorResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public InvestorResponse update(InvestorRequest investorRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
