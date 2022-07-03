package hu.gcsikos.collector.collectorbackendms.service;

import hu.gcsikos.collector.collectorbackendms.mapper.SellerMapper;
import hu.gcsikos.collector.collectorbackendms.repository.user.SellerRepository;
import hu.gcsikos.collector.collectorbackendms.request.generic.SellerRequest;
import hu.gcsikos.collector.collectorbackendms.response.SellerResponse;
import hu.gcsikos.collector.collectorbackendms.service.api.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private SellerMapper sellerMapper;

    @Override
    public SellerResponse create(SellerRequest sellerRequest) {
        return null;
    }

    @Override
    public SellerResponse getById(Long id) {
        return null;
    }

    @Override
    public Page<SellerResponse> listElements(Pageable pageable) {
        return null;
    }

    @Override
    public SellerResponse update(SellerRequest sellerRequest) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
