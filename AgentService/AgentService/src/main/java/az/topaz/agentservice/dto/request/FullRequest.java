package az.topaz.agentservice.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class FullRequest {

    private TicketRequest ticketRequest;
    private List<TicketBetlineRequest> ticketBetlineRequestList;
}
