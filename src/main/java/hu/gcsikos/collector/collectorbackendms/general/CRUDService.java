package hu.gcsikos.collector.collectorbackendms.general;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CRUDService<Request, Response> {

  Response create(Request request);

  Response getById(Long id);

  Page<Response> listElements(Pageable pageable);

  Response update(Request request);

  boolean delete(Long id);
}
