package az.topaz.backofficeservice.controller;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.service.businessService.operatorBusinessService.OperatorBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operators")
@RequiredArgsConstructor
public class OperatorController {

    private final OperatorBusinessService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody OperatorRequest request) {
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
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody OperatorRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @GetMapping("/count/{id}")
    public ResponseEntity<?> getCountOfCashiers(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(service.getCountOfCashiers(id));
    }
}
