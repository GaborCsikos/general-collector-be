package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Seller;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.create.SellerRequestForCreate;
import hu.gcsikos.collector.collectorbackendms.request.generic.SellerRequest;
import hu.gcsikos.collector.collectorbackendms.response.SellerResponse;
import org.springframework.stereotype.Component;

@Component
public class SellerMapper implements Mapper<SellerRequest, SellerResponse, Seller, SellerRequestForCreate> {


    @Override
    public SellerResponse mapFromEntityToResponse(Seller seller) {
        return null;
    }

    @Override
    public Seller updateEntity(Seller original, SellerRequestForCreate toUpdate) {
        return null;
    }

    @Override
    public Seller createEntity(SellerRequest toCreate) {
        return null;
    }
}
