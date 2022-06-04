package az.topaz.backofficeservice.repository.agent;

import az.topaz.backofficeservice.repository.CrudRepository;
import nu.studer.sample.tables.records.AgentRecord;
import nu.studer.sample.tables.records.CashierRecord;

import java.util.List;
import java.util.Map;

public interface AgentRepository<T> extends CrudRepository<T> {

    Long countOfCashiers(Long id);

    Map<AgentRecord, List<CashierRecord>> agentWithCashiers();
}
