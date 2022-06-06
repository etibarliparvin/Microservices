package az.topaz.agentservice.grpc;

import az.topaz.agentservice.dto.request.FullRequest;
import az.topaz.agentservice.dto.request.TicketBetlineRequest;
import az.topaz.agentservice.dto.request.TicketRequest;
import az.topaz.agentservice.dto.response.FullResponse;
import com.proto.agent.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgentClientService {

    private ProtoTicketServiceGrpc.ProtoTicketServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1992).usePlaintext().build();
        stub = ProtoTicketServiceGrpc.newBlockingStub(channel);
    }

    public ProtoTicketResponse findTicketById(Long id) {
        ProtoFindByIdRequest build = ProtoFindByIdRequest.newBuilder().setId(id).build();
        ProtoTicketResponse ticketResponse = stub.findById(build);
        return ticketResponse;
    }

    public ProtoTicketResponse create(FullRequest fullRequest) {
        TicketRequest ticketRequest = fullRequest.getTicketRequest();
        List<TicketBetlineRequest> ticketBetlineRequestList = fullRequest.getTicketBetlineRequestList();

        List<ProtoTicketBetlineRequest> requests = new ArrayList<>();

        for (int i = 0; i < ticketBetlineRequestList.size(); i++) {
            ProtoTicketBetlineRequest request = ProtoTicketBetlineRequest.newBuilder()
                    .setTicketId(ticketBetlineRequestList.get(i).getTicketId())
                    .setEvent(ticketBetlineRequestList.get(i).getEvent())
                    .setSportName(ticketBetlineRequestList.get(i).getSportName())
                    .setLanguageName(ticketBetlineRequestList.get(i).getLanguageName())
                    .setCategoryName(ticketBetlineRequestList.get(i).getCategoryName())
                    .setEventStartTime(Timestamp.valueOf(ticketBetlineRequestList.get(i).getEventStartTime()).getTime())
                    .build();
            requests.add(request);
        }

        ProtoTicketRequest build = ProtoTicketRequest.newBuilder()
                .setBarcode(ticketRequest.getBarcode())
                .setCashierCode(ticketRequest.getCashierCode())
                .setBetType(ticketRequest.getBetType())
                .setStakeAmount(ticketRequest.getStakeAmount().doubleValue())
                .setTotalWinAmount(ticketRequest.getTotalWinAmount().doubleValue())
                .setTotalPayAmount(ticketRequest.getTotalPayAmount().doubleValue())
                .setBetTime(Timestamp.valueOf(ticketRequest.getBetTime()).getTime())
                .setTicketStatus(ticketRequest.getTicketStatus())
                .setOdd(ticketRequest.getOdd().doubleValue())
                .addAllProtoTicketBetlineRequest(requests)
                .build();

        ProtoTicketResponse ticketResponse = stub.createTicket(build);
        return ticketResponse;
    }
}
