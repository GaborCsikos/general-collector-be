package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.request.generic.InvestmentRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestmentResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.InvestmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InvestmentServiceImpl implements InvestmentService {


    @Override
    public InvestmentResponse create(InvestmentRequest investmentRequest) {
        return null;
    }

    @Override
    public InvestmentResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<InvestmentResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public InvestmentResponse update(InvestmentRequest investmentRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
