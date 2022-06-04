package az.topaz.backofficeservice.service.businessService.agentBusinessService;

import az.topaz.backofficeservice.dto.request.AgentRequest;
import az.topaz.backofficeservice.dto.response.AgentCashiersResponse;
import az.topaz.backofficeservice.dto.response.AgentResponse;
import az.topaz.backofficeservice.mapper.businessMapper.AgentResponseMapper;
import az.topaz.backofficeservice.mapper.businessMapper.CashierResponseMapper;
import az.topaz.backofficeservice.service.jooqService.agentJooqService.AgentJooqService;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AgentRecord;
import nu.studer.sample.tables.records.CashierRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AgentBusinessServiceImpl implements AgentBusinessService {

    private final AgentResponseMapper agentResponseMapper;
    private final CashierResponseMapper cashierResponseMapper;
    private final AgentJooqService agentJooqService;

    @Override
    public AgentResponse create(AgentRequest request) {
        return agentResponseMapper.toResponse(agentJooqService.create(request));
    }

    @Override
    public AgentResponse findById(Long id) {
        return agentResponseMapper.toResponse(agentJooqService.findById(id));
    }

    @Override
    public List<AgentResponse> findAll() {
        return agentResponseMapper.toResponseList(agentJooqService.findAll());
    }

    @Override
    public AgentResponse update(Long id, AgentRequest request) {
        return agentResponseMapper.toResponse(agentJooqService.update(id, request));
    }

    @Override
    public Long getCountOfCashiers(Long id) {
        return agentJooqService.getCountOfCashiers(id);
    }

    @Override
    public List<AgentCashiersResponse> getAllAgentsWithCashiers() {
        Map<AgentRecord, List<CashierRecord>> map = agentJooqService.getAllAgentsWithCashiers();
        return map.entrySet().stream()
                .map(m -> {
                    AgentCashiersResponse agentCashiersResponse = new AgentCashiersResponse();
                    agentCashiersResponse.setAgentResponse(agentResponseMapper.toResponse(m.getKey()));
                    agentCashiersResponse.setCashierResponses(cashierResponseMapper.toResponseList(m.getValue()));
                    return agentCashiersResponse;
                })
                .collect(Collectors.toList());
    }
}
