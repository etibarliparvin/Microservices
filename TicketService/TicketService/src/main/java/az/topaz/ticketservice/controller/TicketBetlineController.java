package az.topaz.ticketservice.controller;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.service.businessService.ticketBetlineService.TicketBetlineBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticketBetline")
@RequiredArgsConstructor
public class TicketBetlineController {

    private final TicketBetlineBusinessService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody TicketBetlineRequest request) {
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
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody TicketBetlineRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

}
