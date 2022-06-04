package az.topaz.ticketservice.repository.ticket;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.tables.Ticket.TICKET;

@Repository
@RequiredArgsConstructor
public class TicketRepositoryImpl implements TicketRepository<TicketRecord> {

    private final DSLContext context;

    @Override
    public TicketRecord create(TicketRecord record) {
        return context.insertInto(TICKET)
                .set(record)
                .returning()
                .fetchOneInto(TicketRecord.class);
    }

    @Override
    public TicketRecord findById(Long id) {
        return context.select()
                .from(TICKET)
                .where(TICKET.ID.eq(id))
                .fetchOneInto(TicketRecord.class);
    }

    @Override
    public List<TicketRecord> findAll() {
        return context.select()
                .from(TICKET)
                .fetchInto(TicketRecord.class);
    }

    @Override
    public TicketRecord update(Long id, TicketRecord record) {
        return context.update(TICKET)
                .set(record)
                .where(TICKET.ID.eq(id))
                .returning()
                .fetchOneInto(TicketRecord.class);
    }
}
