package hu.gcsikos.collector.collectorbackendms.mapper;

import hu.gcsikos.collector.collectorbackendms.entity.user.Seller;
import hu.gcsikos.collector.collectorbackendms.general.Mapper;
import hu.gcsikos.collector.collectorbackendms.request.generic.SellerRequest;
import hu.gcsikos.collector.collectorbackendms.response.SellerResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class SellerMapper implements Mapper<SellerRequest, SellerResponse, Seller> {


    @Override
    public SellerResponse mapFromEntityToResponse(Seller mapFrom) {
        SellerResponse response = new SellerResponse();
        BeanUtils.copyProperties(mapFrom, response);
        return response;
    }

    @Override
    public Seller updateEntity(Seller original, SellerRequest updateFrom) {
        BeanUtils.copyProperties(updateFrom, original, "id");
        original.setUpdatedAt(OffsetDateTime.now());
        return original;
    }

    @Override
    public Seller createEntity(SellerRequest createFrom) {
        Seller response = new Seller();
        BeanUtils.copyProperties(createFrom, response);
        response.setCreatedAt(OffsetDateTime.now());
        return response;
    }
}
