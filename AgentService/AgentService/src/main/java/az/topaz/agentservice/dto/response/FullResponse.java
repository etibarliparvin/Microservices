package az.topaz.agentservice.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class FullResponse {

    private TicketResponse ticketResponse;
    private List<TicketBetlineResponse> ticketBetlineResponses;
}
