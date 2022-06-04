package az.topaz.backofficeservice.service.jooqService.agentJooqService;

import az.topaz.backofficeservice.dto.request.AgentRequest;
import az.topaz.backofficeservice.mapper.recordMapper.AgentRecordMapper;
import az.topaz.backofficeservice.repository.agent.AgentRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AgentRecord;
import nu.studer.sample.tables.records.CashierRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AgentJooqServiceImpl implements AgentJooqService {

    private final AgentRecordMapper agentRecordMapper;
    private final AgentRepository<AgentRecord> agentRepository;

    @Override
    public AgentRecord create(AgentRequest request) {
        return agentRepository.create(agentRecordMapper.toRecord(request));
    }

    @Override
    public AgentRecord findById(Long id) {
        return agentRepository.findById(id);
    }

    @Override
    public List<AgentRecord> findAll() {
        return agentRepository.findAll();
    }

    @Override
    public AgentRecord update(Long id, AgentRequest request) {
        return agentRepository.update(id, agentRecordMapper.toRecordUpdate(id, request));
    }

    @Override
    public Long getCountOfCashiers(Long id) {
        return agentRepository.countOfCashiers(id);
    }

    @Override
    public Map<AgentRecord, List<CashierRecord>> getAllAgentsWithCashiers() {
        return agentRepository.agentWithCashiers();
    }
}
