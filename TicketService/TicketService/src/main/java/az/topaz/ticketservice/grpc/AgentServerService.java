package az.topaz.ticketservice.grpc;

import az.topaz.ticketservice.dto.response.FullResponse;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import az.topaz.ticketservice.dto.response.TicketResponse;
import az.topaz.ticketservice.service.businessService.ticketService.TicketBusinessService;
import com.proto.agent.ProtoFindByIdRequest;
import com.proto.agent.ProtoTicketBetlineResponse;
import com.proto.agent.ProtoTicketResponse;
import com.proto.agent.ProtoTicketServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@GrpcService
@RequiredArgsConstructor
public class AgentServerService extends ProtoTicketServiceGrpc.ProtoTicketServiceImplBase {

    private final TicketBusinessService service;

    @Override
    public void findById(ProtoFindByIdRequest request, StreamObserver<ProtoTicketResponse> responseObserver) {
        FullResponse fullResponse = service.findById(request.getId());
        TicketResponse ticketResponse = fullResponse.getTicketResponse();

        List<TicketBetlineResponse> ticketBetlineResponses = fullResponse.getTicketBetlineResponses();

        List<ProtoTicketBetlineResponse> responses = new ArrayList<>();

        for (int i = 0; i < ticketBetlineResponses.size(); i++) {
            ProtoTicketBetlineResponse response = ProtoTicketBetlineResponse.newBuilder()
                    .setId(ticketBetlineResponses.get(i).getId())
                    .setTicketId(ticketBetlineResponses.get(i).getTicketId())
                    .setEvent(ticketBetlineResponses.get(i).getEvent())
                    .setSportName(ticketBetlineResponses.get(i).getSportName())
                    .setLanguageName(ticketBetlineResponses.get(i).getLanguageName())
                    .setCategoryName(ticketBetlineResponses.get(i).getCategoryName())
                    .setEventStartTime(ticketBetlineResponses.get(i).getEventStartTime().toString())
                    .build();
            responses.add(response);
        }

        ProtoTicketResponse response = ProtoTicketResponse.newBuilder()
                .setId(ticketResponse.getId())
                .setBarcode(ticketResponse.getBarcode())
                .setCashierCode(ticketResponse.getCashierCode())
                .setBetType(ticketResponse.getBetType())
                .setStakeAmount(ticketResponse.getStakeAmount().toString())
                .setTotalWinAmount(ticketResponse.getTotalWinAmount().toString())
                .setTotalPayAmount(ticketResponse.getTotalPayAmount().toString())
                .setBetTime(ticketResponse.getBetTime().toString())
                .setTicketStatus(ticketResponse.getTicketStatus())
                .setOdd(ticketResponse.getOdd().toString())
                .addAllProtoTicketBetlineResponse(responses)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
