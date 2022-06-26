package hu.gcsikos.collector.collectorbackendms.service.api;

import hu.gcsikos.collector.collectorbackendms.general.CRUDService;
import hu.gcsikos.collector.collectorbackendms.request.generic.ProductRequest;
import hu.gcsikos.collector.collectorbackendms.response.ProductResponse;

public interface ProductService extends CRUDService<ProductRequest, ProductResponse> {
}
