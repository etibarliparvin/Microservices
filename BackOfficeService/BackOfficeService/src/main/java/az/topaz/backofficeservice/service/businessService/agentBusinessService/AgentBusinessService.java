package az.topaz.backofficeservice.service.businessService.agentBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.AgentRequest;
import az.topaz.backofficeservice.dto.response.AgentCashiersResponse;
import az.topaz.backofficeservice.dto.response.AgentResponse;

import java.util.List;

public interface AgentBusinessService {

    CommonResponse create(AgentRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, AgentRequest request);

    CommonResponse getCountOfCashiers(Long id);

    CommonResponse getAllAgentsWithCashiers();
}
