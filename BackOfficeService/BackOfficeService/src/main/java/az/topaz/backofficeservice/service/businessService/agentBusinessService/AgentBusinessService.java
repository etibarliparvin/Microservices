package az.topaz.backofficeservice.service.businessService.agentBusinessService;

import az.topaz.backofficeservice.dto.request.AgentRequest;
import az.topaz.backofficeservice.dto.response.AgentCashiersResponse;
import az.topaz.backofficeservice.dto.response.AgentResponse;

import java.util.List;

public interface AgentBusinessService {

    AgentResponse create(AgentRequest request);

    AgentResponse findById(Long id);

    List<AgentResponse> findAll();

    AgentResponse update(Long id, AgentRequest request);

    Long getCountOfCashiers(Long id);

    List<AgentCashiersResponse> getAllAgentsWithCashiers();
}
