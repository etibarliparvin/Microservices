package az.topaz.backofficeservice.repository.cashier;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.public_.tables.records.CashierRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

import static nu.studer.sample.public_.tables.Agent.AGENT;
import static nu.studer.sample.public_.tables.Cashier.CASHIER;

@Repository
@RequiredArgsConstructor
public class CashierRepositoryImpl implements CashierRepository<CashierRecord> {

    private final DSLContext context;

    @Override
    public CashierRecord create(CashierRecord record) {
        return context.insertInto(CASHIER)
                .set(record)
                .returning()
                .fetchOneInto(CashierRecord.class);
    }

    @Override
    public CashierRecord findById(Long id) {
        return context.select()
                .from(CASHIER)
                .where(CASHIER.ID.eq(id))
                .fetchOneInto(CashierRecord.class);
    }

    // TODO pageable olacaq, limit ve offset gelecek.(integer)
    @Override
    public List<CashierRecord> findAll() {
        return context.select()
                .from(CASHIER)
                .fetchInto(CashierRecord.class);
    }

    @Override
    public CashierRecord update(Long id, CashierRecord record) {
        return context.update(CASHIER)
                .set(record)
                .where(CASHIER.ID.eq(id))
                .returning()
                .fetchOneInto(CashierRecord.class);
    }

    @Override
    public BigDecimal balanceDifference(Long id) {
        return context.select(AGENT.TOTAL_CUR_BALANCE.minus(CASHIER.CURRENT_BALANCE))
                .from(CASHIER)
                .join(AGENT)
                .on(AGENT.ID.eq(CASHIER.AGENT_ID))
                .where(CASHIER.ID.eq(id))
                .groupBy(AGENT.ID, AGENT.TOTAL_CUR_BALANCE)
                .fetchOneInto(BigDecimal.class);
    }
}
