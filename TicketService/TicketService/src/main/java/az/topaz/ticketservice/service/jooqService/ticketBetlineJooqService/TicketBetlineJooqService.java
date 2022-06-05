package az.topaz.ticketservice.service.jooqService.ticketBetlineJooqService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import nu.studer.sample.tables.records.TicketBetlineRecord;

import java.util.List;

public interface TicketBetlineJooqService {

    TicketBetlineRecord create(TicketBetlineRequest request);

    TicketBetlineRecord findById(Long id);

    List<TicketBetlineRecord> findAll();

    List<TicketBetlineRecord> findAllByTicketId(Long id);

    TicketBetlineRecord update(Long id, TicketBetlineRequest request);

}
