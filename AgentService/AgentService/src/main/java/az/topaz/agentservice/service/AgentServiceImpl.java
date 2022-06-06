package az.topaz.agentservice.service;

import az.topaz.agentservice.dto.request.FullRequest;
import az.topaz.agentservice.dto.response.FullResponse;
import az.topaz.agentservice.dto.response.TicketBetlineResponse;
import az.topaz.agentservice.dto.response.TicketResponse;
import az.topaz.agentservice.grpc.AgentClientService;
import com.proto.agent.ProtoTicketBetlineResponse;
import com.proto.agent.ProtoTicketResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Service
@RequiredArgsConstructor
public class AgentServiceImpl implements AgentService {

    private final AgentClientService agentClientService;

    @Override
    public FullResponse findById(Long id) {
        ProtoTicketResponse found = agentClientService.findTicketById(id);
        return toFullResponse(found);
    }

    @Override
    public FullResponse create(FullRequest request) {
        ProtoTicketResponse protoTicketResponse = agentClientService.create(request);
        return toFullResponse(protoTicketResponse);
    }

    private FullResponse toFullResponse(ProtoTicketResponse found) {
        List<ProtoTicketBetlineResponse> protoTicketBetlineResponseList = found.getProtoTicketBetlineResponseList();

        FullResponse fullResponse = new FullResponse();
        TicketResponse ticketResponse = new TicketResponse();
        List<TicketBetlineResponse> ticketBetlineResponses = new ArrayList<>();

        ticketResponse.setId(found.getId());
        ticketResponse.setBarcode(found.getBarcode());
        ticketResponse.setCashierCode(found.getCashierCode());
        ticketResponse.setBetType(found.getBetType());
        ticketResponse.setStakeAmount(BigDecimal.valueOf(found.getStakeAmount()));
        ticketResponse.setTotalWinAmount(BigDecimal.valueOf(found.getTotalWinAmount()));
        ticketResponse.setTotalPayAmount(BigDecimal.valueOf(found.getTotalPayAmount()));
        ticketResponse.setBetTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(found.getBetTime()), TimeZone.getDefault().toZoneId()));
        ticketResponse.setTicketStatus(found.getTicketStatus());
        ticketResponse.setOdd(BigDecimal.valueOf(found.getOdd()));

        for (int i = 0; i < protoTicketBetlineResponseList.size(); i++) {
            TicketBetlineResponse response = new TicketBetlineResponse();
            response.setId(protoTicketBetlineResponseList.get(i).getId());
            response.setTicketId(protoTicketBetlineResponseList.get(i).getTicketId());
            response.setEvent(protoTicketBetlineResponseList.get(i).getEvent());
            response.setSportName(protoTicketBetlineResponseList.get(i).getSportName());
            response.setLanguageName(protoTicketBetlineResponseList.get(i).getLanguageName());
            response.setCategoryName(protoTicketBetlineResponseList.get(i).getCategoryName());
            response.setEventStartTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(protoTicketBetlineResponseList.get(i).getEventStartTime()), TimeZone.getDefault().toZoneId()));
            ticketBetlineResponses.add(response);
        }

        fullResponse.setTicketResponse(ticketResponse);
        fullResponse.setTicketBetlineResponses(ticketBetlineResponses);
        return fullResponse;
    }
}
