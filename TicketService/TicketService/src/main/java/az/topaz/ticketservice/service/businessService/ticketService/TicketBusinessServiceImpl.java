package az.topaz.ticketservice.service.businessService.ticketService;

import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.TicketResponse;
import az.topaz.ticketservice.mapper.businessMapper.TicketResponseMapper;
import az.topaz.ticketservice.service.jooqService.ticketJooqService.TicketJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBusinessServiceImpl implements TicketBusinessService{

    private final TicketResponseMapper ticketResponseMapper;
    private final TicketJooqService ticketJooqService;

    @Override
    public TicketResponse create(TicketRequest request) {
        return ticketResponseMapper.toResponse(ticketJooqService.create(request));
    }

    @Override
    public TicketResponse findById(Long id) {
        return ticketResponseMapper.toResponse(ticketJooqService.findById(id));
    }

    @Override
    public List<TicketResponse> findAll() {
        return ticketResponseMapper.toResponseList(ticketJooqService.findAll());
    }

    @Override
    public TicketResponse update(Long id, TicketRequest request) {
        return ticketResponseMapper.toResponse(ticketJooqService.update(id, request));

    }
}
