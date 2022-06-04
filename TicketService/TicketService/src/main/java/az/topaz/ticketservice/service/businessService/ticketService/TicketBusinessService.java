package az.topaz.ticketservice.service.businessService.ticketService;

import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.TicketResponse;

import java.util.List;

public interface TicketBusinessService {

    TicketResponse create(TicketRequest request);

    TicketResponse findById(Long id);

    List<TicketResponse> findAll();

    TicketResponse update(Long id, TicketRequest request);

}
