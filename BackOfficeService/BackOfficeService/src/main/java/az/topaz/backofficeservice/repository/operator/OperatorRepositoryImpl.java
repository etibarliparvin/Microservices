package az.topaz.backofficeservice.repository.operator;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.public_.tables.records.OperatorRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.public_.tables.Cashier.CASHIER;
import static nu.studer.sample.public_.tables.Operator.OPERATOR;

@Repository
@RequiredArgsConstructor
public class OperatorRepositoryImpl implements OperatorRepository<OperatorRecord> {

    private final DSLContext context;

    @Override
    public OperatorRecord create(OperatorRecord record) {
        return context.insertInto(OPERATOR)
                .set(record)
                .returning()
                .fetchOneInto(OperatorRecord.class);
    }

    @Override
    public OperatorRecord findById(Long id) {
        return context.select()
                .from(OPERATOR)
                .where(OPERATOR.ID.eq(id))
                .fetchOneInto(OperatorRecord.class);
    }

    @Override
    public List<OperatorRecord> findAll() {
        return context.select()
                .from(OPERATOR)
                .fetchInto(OperatorRecord.class);
    }

    @Override
    public OperatorRecord update(Long id, OperatorRecord record) {
        return context.select()
                .from(OPERATOR)
                .where(OPERATOR.ID.eq(id))
                .fetchOneInto(OperatorRecord.class);
    }

    // TODO cashier table-da opertor_id column olmadiqda nece uygunlawdirmaq olar?
    @Override
    public Long countOfCashiers(Long id) {
        return context.selectCount()
                .from(OPERATOR)
                .join(CASHIER)
                .on(CASHIER.OPERATOR_ID.eq(OPERATOR.ID))
                .where(OPERATOR.ID.eq(id))
                .fetchOneInto(Long.class);
    }
}
