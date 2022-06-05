package az.topaz.agentservice.controller;

import az.topaz.agentservice.dto.response.FullResponse;
import az.topaz.agentservice.dto.response.TicketBetlineResponse;
import az.topaz.agentservice.dto.response.TicketResponse;
import az.topaz.agentservice.grpc.AgentClientService;
import com.proto.agent.ProtoTicketResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/agents")
@RequiredArgsConstructor
public class AgentController {


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        AgentClientService grpcService = new AgentClientService();
        ProtoTicketResponse found = grpcService.findTicketById(id);

        FullResponse fullResponse = new FullResponse();
        TicketResponse ticketResponse = new TicketResponse();
        List<TicketBetlineResponse> ticketBetlineResponses = new ArrayList<>();

        ticketResponse.setId(found.getId());
        ticketResponse.setBarcode(found.getBarcode());
        ticketResponse.setCashierCode(found.getCashierCode());
        ticketResponse.setBetType(found.getBetType());
        ticketResponse.setStakeAmount(BigDecimal.valueOf(Long.parseLong(found.getStakeAmound())));
        ticketResponse.setTotalWinAmount(BigDecimal.valueOf(Long.parseLong(found.getTotalWinAmount())));
        ticketResponse.setTotalPayAmount(BigDecimal.valueOf(Long.parseLong(found.getTotalPayAmount())));
        ticketResponse.setBetTime(LocalDateTime.parse(found.getBetTime()));
        ticketResponse.setOdd(BigDecimal.valueOf(Long.parseLong(found.getOdd())));

        fullResponse.setTicketResponse(ticketResponse);
        return ResponseEntity.ok(fullResponse);
    }
}
