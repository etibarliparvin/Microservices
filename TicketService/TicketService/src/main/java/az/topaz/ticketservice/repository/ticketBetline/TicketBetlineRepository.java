package az.topaz.ticketservice.repository.ticketBetline;

import az.topaz.ticketservice.repository.CrudRepository;
import nu.studer.sample.tables.records.TicketBetlineRecord;

import java.util.List;

public interface TicketBetlineRepository<T> extends CrudRepository<T> {

    List<TicketBetlineRecord> getAllBetlinesWithTicketId(Long id);
}
