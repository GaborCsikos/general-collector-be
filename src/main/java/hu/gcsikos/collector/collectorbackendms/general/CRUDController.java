package hu.gcsikos.collector.collectorbackendms.general;

import hu.gcsikos.collector.collectorbackendms.response.GenericResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface CRUDController<Request, Response> {

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
