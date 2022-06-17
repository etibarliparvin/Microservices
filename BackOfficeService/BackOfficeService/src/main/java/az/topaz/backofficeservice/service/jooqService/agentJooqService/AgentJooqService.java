package az.topaz.backofficeservice.service.jooqService.agentJooqService;

import az.topaz.backofficeservice.dto.request.AgentRequest;
import nu.studer.sample.public_.tables.records.AgentRecord;
import nu.studer.sample.public_.tables.records.CashierRecord;

import java.util.List;
import java.util.Map;

public interface AgentJooqService {

    AgentRecord create(AgentRequest request);

    AgentRecord findById(Long id);

    List<AgentRecord> findAll();

    AgentRecord update(Long id, AgentRequest request);

    Long getCountOfCashiers(Long id);

    Map<AgentRecord, List<CashierRecord>> getAllAgentsWithCashiers();
}
