package az.topaz.agentservice.controller;

import az.topaz.agentservice.dto.request.FullRequest;
import az.topaz.agentservice.dto.response.FullResponse;
import az.topaz.agentservice.dto.response.TicketBetlineResponse;
import az.topaz.agentservice.dto.response.TicketResponse;
import az.topaz.agentservice.grpc.AgentClientService;
import az.topaz.agentservice.service.AgentService;
import com.proto.agent.ProtoTicketBetlineResponse;
import com.proto.agent.ProtoTicketResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentController {

    private final AgentService agentService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(agentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody FullRequest request) {
        return ResponseEntity.ok(agentService.create(request));
    }

}
