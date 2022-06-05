package az.topaz.ticketservice.service.businessService.ticketBetlineService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import az.topaz.ticketservice.mapper.businessMapper.TicketBetlineResponseMapper;
import az.topaz.ticketservice.service.jooqService.ticketBetlineJooqService.TicketBetlineJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBetlineBusinessServiceImpl implements TicketBetlineBusinessService {

    private final TicketBetlineResponseMapper ticketBetlineResponseMapper;
    private final TicketBetlineJooqService ticketBetlineJooqService;


    @Override
    public TicketBetlineResponse create(TicketBetlineRequest request) {
        return ticketBetlineResponseMapper.toResponse(ticketBetlineJooqService.create(request));
    }

    @Override
    public TicketBetlineResponse findById(Long id) {
        return ticketBetlineResponseMapper.toResponse(ticketBetlineJooqService.findById(id));
    }

    @Override
    public List<TicketBetlineResponse> findAll() {
        return ticketBetlineResponseMapper.toResponseList(ticketBetlineJooqService.findAll());
    }

    @Override
    public List<TicketBetlineResponse> findAllByTicketId(Long id) {
        return ticketBetlineResponseMapper.toResponseList(ticketBetlineJooqService.findAllByTicketId(id));
    }

    @Override
    public TicketBetlineResponse update(Long id, TicketBetlineRequest request) {
        return ticketBetlineResponseMapper.toResponse(ticketBetlineJooqService.update(id, request));
    }
}
