package az.topaz.ticketservice.grpc;

import az.topaz.ticketservice.dto.request.FullRequest;
import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.FullResponse;
import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import az.topaz.ticketservice.dto.response.TicketResponse;
import az.topaz.ticketservice.service.businessService.ticketService.TicketBusinessService;
import com.proto.agent.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Service
@GrpcService
@RequiredArgsConstructor
public class AgentServerService extends ProtoTicketServiceGrpc.ProtoTicketServiceImplBase {

    private final TicketBusinessService service;

    private ProtoTicketResponse toProtoResponse(FullResponse fullResponse) {
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
                    .setEventStartTime(Timestamp.valueOf(ticketBetlineResponses.get(i).getEventStartTime()).getTime())
                    .build();
            responses.add(response);
        }

        ProtoTicketResponse response = ProtoTicketResponse.newBuilder()
                .setId(ticketResponse.getId())
                .setBarcode(ticketResponse.getBarcode())
                .setCashierCode(ticketResponse.getCashierCode())
                .setBetType(ticketResponse.getBetType())
                .setStakeAmount(ticketResponse.getStakeAmount().doubleValue())
                .setTotalWinAmount(ticketResponse.getTotalWinAmount().doubleValue())
                .setTotalPayAmount(ticketResponse.getTotalPayAmount().doubleValue())
                .setBetTime(Timestamp.valueOf(ticketResponse.getBetTime()).getTime())
                .setTicketStatus(ticketResponse.getTicketStatus())
                .setOdd(ticketResponse.getOdd().doubleValue())
                .addAllProtoTicketBetlineResponse(responses)
                .build();

        return response;
    }

    @Override
    public void findById(ProtoFindByIdRequest request, StreamObserver<ProtoTicketResponse> responseObserver) {
        FullResponse fullResponse = service.findById(request.getId());

        ProtoTicketResponse protoTicketResponse = toProtoResponse(fullResponse);
        responseObserver.onNext(protoTicketResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void createTicket(ProtoTicketRequest request, StreamObserver<ProtoTicketResponse> responseObserver) {
        FullRequest fullRequest = new FullRequest();

        TicketRequest ticketRequest = new TicketRequest();
        ticketRequest.setBarcode(request.getBarcode());
        ticketRequest.setCashierCode(request.getCashierCode());
        ticketRequest.setBetType(request.getBetType());
        ticketRequest.setTicketStatus(request.getTicketStatus());
        ticketRequest.setStakeAmount(BigDecimal.valueOf(request.getStakeAmount()));
        ticketRequest.setTotalWinAmount(BigDecimal.valueOf(request.getTotalWinAmount()));
        ticketRequest.setTotalPayAmount(BigDecimal.valueOf(request.getTotalPayAmount()));
        ticketRequest.setBetTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getBetTime()), TimeZone
                .getDefault().toZoneId()));
        ticketRequest.setTicketStatus(request.getTicketStatus());
        ticketRequest.setOdd(BigDecimal.valueOf(request.getOdd()));

        List<TicketBetlineRequest> ticketBetlineRequestList = new ArrayList<>();
        List<ProtoTicketBetlineRequest> protoTicketBetlineRequestList = request.getProtoTicketBetlineRequestList();

        for (int i = 0; i < protoTicketBetlineRequestList.size(); i++) {
            TicketBetlineRequest request1 = new TicketBetlineRequest();
            request1.setTicketId(protoTicketBetlineRequestList.get(i).getTicketId());
            request1.setEvent(protoTicketBetlineRequestList.get(i).getEvent());
            request1.setSportName(protoTicketBetlineRequestList.get(i).getSportName());
            request1.setLanguageName(protoTicketBetlineRequestList.get(i).getLanguageName());
            request1.setCategoryName(protoTicketBetlineRequestList.get(i).getCategoryName());
            request1.setEventStartTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(protoTicketBetlineRequestList.get(i).getEventStartTime()), TimeZone
                    .getDefault().toZoneId()));

            ticketBetlineRequestList.add(request1);
        }

        fullRequest.setTicketRequest(ticketRequest);
        fullRequest.setTicketBetlineRequestList(ticketBetlineRequestList);

        FullResponse fullResponse = service.create(fullRequest);

        ProtoTicketResponse protoTicketResponse = toProtoResponse(fullResponse);
        responseObserver.onNext(protoTicketResponse);
        responseObserver.onCompleted();
    }
}
