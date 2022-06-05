package az.topaz.agentservice.grpc;

import com.proto.agent.ProtoFindByIdRequest;
import com.proto.agent.ProtoTicketResponse;
import com.proto.agent.ProtoTicketServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AgentClientService {

    private ProtoTicketServiceGrpc.ProtoTicketServiceBlockingStub stub;

    @PostConstruct
    public void init() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1992).usePlaintext().build();
        stub = ProtoTicketServiceGrpc.newBlockingStub(channel);
    }

    public ProtoTicketResponse findTicketById(Long id) {
        System.out.println(id);
        ProtoFindByIdRequest build = ProtoFindByIdRequest.newBuilder().setId(id).build();
        ProtoTicketResponse ticketResponse = stub.findById(build);
        System.out.println(ticketResponse);
        return ticketResponse;
    }

}
