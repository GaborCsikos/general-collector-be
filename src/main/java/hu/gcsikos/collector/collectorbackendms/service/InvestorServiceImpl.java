package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.mapper.InvestorMapper;
import hu.gcsikos.collector.collectorbackendms.repository.user.InvestorRepository;
import hu.gcsikos.collector.collectorbackendms.request.generic.InvestorRequest;
import hu.gcsikos.collector.collectorbackendms.response.InvestorResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InvestorServiceImpl implements InvestorService {

    @Autowired
    private InvestorRepository investorRepository;
    @Autowired
    private InvestorMapper investorMapper;

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
