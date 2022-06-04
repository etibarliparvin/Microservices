package az.topaz.ticketservice.service.businessService.ticketBetlineService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import az.topaz.ticketservice.dto.response.TicketResponse;

import java.util.List;

public interface TicketBetlineBusinessService {

    TicketBetlineResponse create(TicketBetlineRequest request);

    TicketBetlineResponse findById(Long id);

    List<TicketBetlineResponse> findAll();

    TicketBetlineResponse update(Long id, TicketBetlineRequest request);
}
