package az.topaz.backofficeservice.controller;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.service.businessService.taxBusinessService.TaxBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taxes")
@RequiredArgsConstructor
public class TaxController {

    private final TaxBusinessService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TaxRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody TaxRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }
}
