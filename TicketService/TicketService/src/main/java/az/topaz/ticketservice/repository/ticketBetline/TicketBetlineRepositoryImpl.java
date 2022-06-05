package az.topaz.ticketservice.repository.ticketBetline;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.tables.TicketBetline.TICKET_BETLINE;

@Repository
@RequiredArgsConstructor
public class TicketBetlineRepositoryImpl implements TicketBetlineRepository<TicketBetlineRecord> {

    private final DSLContext context;

    @Override
    public TicketBetlineRecord create(TicketBetlineRecord record) {
        return context.insertInto(TICKET_BETLINE)
                .set(record)
                .returning()
                .fetchOneInto(TicketBetlineRecord.class);
    }

    @Override
    public TicketBetlineRecord findById(Long id) {
        return context.select()
                .from(TICKET_BETLINE)
                .where(TICKET_BETLINE.ID.eq(id))
                .fetchOneInto(TicketBetlineRecord.class);
    }

    @Override
    public List<TicketBetlineRecord> findAll() {
        return context.select()
                .from(TICKET_BETLINE)
                .fetchInto(TicketBetlineRecord.class);
    }

    @Override
    public TicketBetlineRecord update(Long id, TicketBetlineRecord record) {
        return context.update(TICKET_BETLINE)
                .set(record)
                .where(TICKET_BETLINE.ID.eq(id))
                .returning()
                .fetchOneInto(TicketBetlineRecord.class);
    }

    @Override
    public List<TicketBetlineRecord> getAllBetlinesWithTicketId(Long id) {
        return context.select()
                .from(TICKET_BETLINE)
                .where(TICKET_BETLINE.TICKET_ID.eq(id))
                .fetchInto(TicketBetlineRecord.class);
    }
}
