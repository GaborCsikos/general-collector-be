package hu.gcsikos.collector.collectorbackendms.general;

import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CRUDController<Request, Response> {

    String DELETED = "Deleted";

    @PostMapping
    ResponseEntity<Response> create(@Valid @RequestBody Request request);

    @GetMapping(path = "/{id}")
    ResponseEntity<Response> getById(@PathVariable Long id);

    @GetMapping(path = "/list")
    Page<Response> listElements(@NotNull final Pageable pageable);

    @PutMapping
    ResponseEntity<Response> update(@Valid @RequestBody Request request);

    @DeleteMapping(path = "/{id}")
    ResponseEntity<GenericResponse> delete(@PathVariable Long id);
}
