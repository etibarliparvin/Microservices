package az.topaz.ticketservice.service.businessService.ticketService;

import az.topaz.ticketservice.dto.request.FullRequest;
import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.FullResponse;
import az.topaz.ticketservice.dto.response.TicketResponse;

import java.util.List;

public interface TicketBusinessService {

    FullResponse create(FullRequest request);

    FullResponse findById(Long id);

    List<FullResponse> findAll();

    FullResponse update(Long id, FullRequest request);
}
