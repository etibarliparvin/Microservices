package az.topaz.ticketservice.service.businessService.ticketService;

import az.topaz.ticketservice.dto.request.FullRequest;
import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.FullResponse;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import az.topaz.ticketservice.dto.response.TicketResponse;
import az.topaz.ticketservice.mapper.businessMapper.TicketBetlineResponseMapper;
import az.topaz.ticketservice.mapper.businessMapper.TicketResponseMapper;
import az.topaz.ticketservice.service.jooqService.ticketBetlineJooqService.TicketBetlineJooqService;
import az.topaz.ticketservice.service.jooqService.ticketJooqService.TicketJooqService;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBusinessServiceImpl implements TicketBusinessService {

    private final TicketResponseMapper ticketResponseMapper;
    private final TicketBetlineResponseMapper ticketBetlineResponseMapper;
    private final TicketJooqService ticketJooqService;
    private final TicketBetlineJooqService ticketBetlineJooqService;

    @Override
    public FullResponse create(FullRequest request) {
        TicketRequest ticketRequest = request.getTicketRequest();
        List<TicketBetlineRequest> ticketBetlineRequest = request.getTicketBetlineRequestList();

        TicketResponse ticketResponse = ticketResponseMapper.toResponse(ticketJooqService.create(ticketRequest));
        List<TicketBetlineResponse> list = new ArrayList<>();

        for(TicketBetlineRequest ticketBetlineRequest1 : ticketBetlineRequest) {
            list.add(ticketBetlineResponseMapper.toResponse(ticketBetlineJooqService.create(ticketBetlineRequest1)));
        }

        FullResponse fullResponse = new FullResponse();
        fullResponse.setTicketResponse(ticketResponse);
        fullResponse.setTicketBetlineResponses(list);
        return fullResponse;
    }

    @Override
    public FullResponse findById(Long id) {
        FullResponse fullResponse = new FullResponse();

        TicketResponse ticketResponse = ticketResponseMapper.toResponse(ticketJooqService.findById(id));
        List<TicketBetlineResponse> ticketBetlineResponseList = ticketBetlineResponseMapper.toResponseList(ticketBetlineJooqService.findAllByTicketId(id));

        fullResponse.setTicketResponse(ticketResponse);
        fullResponse.setTicketBetlineResponses(ticketBetlineResponseList);
        System.out.println(fullResponse);
        return fullResponse;
    }

    @Override
    public List<FullResponse> findAll() {
        return null;
    }

    @Override
    public FullResponse update(Long id, FullRequest request) {
        return null;
    }

//    public TicketResponse create(TicketRequest request) {
//        return ticketResponseMapper.toResponse(ticketJooqService.create(request));
//    }
//
//    public TicketResponse findById(Long id) {
//        return ticketResponseMapper.toResponse(ticketJooqService.findById(id));
//    }
//
//    public List<TicketResponse> findAll() {
//        return ticketResponseMapper.toResponseList(ticketJooqService.findAll());
//    }
//
//    public TicketResponse update(Long id, TicketRequest request) {
//        return ticketResponseMapper.toResponse(ticketJooqService.update(id, request));
//
//    }
}
