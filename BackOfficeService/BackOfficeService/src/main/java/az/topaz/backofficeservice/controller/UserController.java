package az.topaz.backofficeservice.controller;

import az.topaz.backofficeservice.dto.request.UserRequest;
import az.topaz.backofficeservice.service.businessService.userBusinessService.UserBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserBusinessService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserRequest request) {
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
    public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody UserRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }
}
