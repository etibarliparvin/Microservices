package az.topaz.backofficeservice.service.businessService.agentBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.AgentRequest;
import az.topaz.backofficeservice.dto.response.AgentCashiersResponse;
import az.topaz.backofficeservice.mapper.businessMapper.AgentResponseMapper;
import az.topaz.backofficeservice.mapper.businessMapper.CashierResponseMapper;
import az.topaz.backofficeservice.service.jooqService.agentJooqService.AgentJooqService;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.public_.tables.records.AgentRecord;
import nu.studer.sample.public_.tables.records.CashierRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AgentBusinessServiceImpl implements AgentBusinessService {

    private final AgentResponseMapper agentResponseMapper;
    private final CashierResponseMapper cashierResponseMapper;
    private final AgentJooqService agentJooqService;

    @Override
    public CommonResponse create(AgentRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(agentResponseMapper.toResponse(agentJooqService.create(request)));
        return response;
    }

    @Override
    public CommonResponse findById(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(agentResponseMapper.toResponse(agentJooqService.findById(id)));
        return response;
    }

    @Override
    public CommonResponse findAll() {
        CommonResponse response = new CommonResponse();
        response.setItem(agentResponseMapper.toResponseList(agentJooqService.findAll()));
        return response;
    }

    @Override
    public CommonResponse update(Long id, AgentRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(agentResponseMapper.toResponse(agentJooqService.update(id, request)));
        return response;
    }

    @Override
    public CommonResponse getCountOfCashiers(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(agentJooqService.getCountOfCashiers(id));
        return response;
    }

    @Override
    public CommonResponse getAllAgentsWithCashiers() {
        CommonResponse response = new CommonResponse();
        Map<AgentRecord, List<CashierRecord>> map = agentJooqService.getAllAgentsWithCashiers();
        response.setItem(map.entrySet().stream()
                .map(m -> {
                    AgentCashiersResponse agentCashiersResponse = new AgentCashiersResponse();
                    agentCashiersResponse.setAgentResponse(agentResponseMapper.toResponse(m.getKey()));
                    agentCashiersResponse.setCashierResponses(cashierResponseMapper.toResponseList(m.getValue()));
                    return agentCashiersResponse;
                })
                .collect(Collectors.toList()));
        return response;
    }
}
