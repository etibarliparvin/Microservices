package az.topaz.backofficeservice.controller;

import az.topaz.backofficeservice.dto.request.CashierRequest;
import az.topaz.backofficeservice.repository.cashier.CashierRepository;
import az.topaz.backofficeservice.service.businessService.cashierBusinessService.CashierBusinessService;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.public_.tables.records.CashierRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cashiers")
@RequiredArgsConstructor
public class CashierController {
    private final CashierBusinessService service;
    private final CashierRepository<CashierRecord> cashierRepository;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CashierRequest request) {
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
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody CashierRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @GetMapping("/balance/{id}")
    public void balanceDifference(@PathVariable Long id) {
        cashierRepository.balanceDifference(id);
    }
}
