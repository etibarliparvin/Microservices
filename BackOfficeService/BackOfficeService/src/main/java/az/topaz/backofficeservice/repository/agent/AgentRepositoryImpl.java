package az.topaz.backofficeservice.repository.agent;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AgentRecord;
import nu.studer.sample.tables.records.CashierRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static nu.studer.sample.tables.Agent.AGENT;
import static nu.studer.sample.tables.Cashier.CASHIER;

@Repository
@RequiredArgsConstructor
public class AgentRepositoryImpl implements AgentRepository<AgentRecord> {

    private final DSLContext context;

    @Override
    public AgentRecord create(AgentRecord record) {
        return context.insertInto(AGENT)
                .set(record)
                .returning()
                .fetchOneInto(AgentRecord.class);
    }

    @Override
    public AgentRecord findById(Long id) {
        return context.select()
                .from(AGENT)
                .where(AGENT.ID.eq(id))
                .fetchOneInto(AgentRecord.class);
    }

    @Override
    public List<AgentRecord> findAll() {
        return context.select()
                .from(AGENT)
                .fetchInto(AgentRecord.class);
    }

    @Override
    public AgentRecord update(Long id, AgentRecord record) {
        return context.select()
                .from(AGENT)
                .where(AGENT.ID.eq(id))
                .fetchOneInto(AgentRecord.class);
    }

    @Override
    public Long countOfCashiers(Long id) {
        return context.selectCount()
                .from(AGENT)
                .join(CASHIER)
                .on(CASHIER.AGENT_ID.eq(AGENT.ID))
                .where(AGENT.ID.eq(id))
                .fetchOneInto(Long.class);
    }

    @Override
    public Map<AgentRecord, List<CashierRecord>> agentWithCashiers() {
        return context.select()
                .from(AGENT)
                .leftJoin(CASHIER)
                .on(CASHIER.AGENT_ID.eq(AGENT.ID))
                .fetchGroups(AgentRecord.class, CashierRecord.class);
    }
}
