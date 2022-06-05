package az.topaz.ticketservice.service.businessService.ticketBetlineService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;

import java.util.List;

public interface TicketBetlineBusinessService {

    TicketBetlineResponse create(TicketBetlineRequest request);

    TicketBetlineResponse findById(Long id);

    List<TicketBetlineResponse> findAll();

    List<TicketBetlineResponse> findAllByTicketId(Long id);

    TicketBetlineResponse update(Long id, TicketBetlineRequest request);
}
