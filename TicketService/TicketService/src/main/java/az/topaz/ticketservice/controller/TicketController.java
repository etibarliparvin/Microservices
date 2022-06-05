package az.topaz.ticketservice.controller;

import az.topaz.ticketservice.dto.request.FullRequest;
import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.service.businessService.ticketService.TicketBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketBusinessService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody FullRequest request) {
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
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody FullRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }


}
