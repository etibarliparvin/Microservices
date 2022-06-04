package az.topaz.backofficeservice.repository.tax;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TaxRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.tables.Tax.TAX;

@Repository
@RequiredArgsConstructor
public class TaxRepositoryImpl implements TaxRepository<TaxRecord> {

    private final DSLContext context;


    @Override
    public TaxRecord create(TaxRecord record) {
        return context.insertInto(TAX)
                .set(record)
                .returning()
                .fetchOneInto(TaxRecord.class);
    }

    @Override
    public TaxRecord findById(Long id) {
        return context.select()
                .from(TAX)
                .where(TAX.ID.eq(id))
                .fetchOneInto(TaxRecord.class);
    }

    @Override
    public List<TaxRecord> findAll() {
        return context.select()
                .from(TAX)
                .fetchInto(TaxRecord.class);
    }

    @Override
    public TaxRecord update(Long id, TaxRecord record) {
        return context.update(TAX)
                .set(record)
                .where(TAX.ID.eq(id))
                .returning()
                .fetchOneInto(TaxRecord.class);
    }
}
