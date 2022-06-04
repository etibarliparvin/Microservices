package az.topaz.ticketservice.service.jooqService.ticketBetlineJooqService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import nu.studer.sample.tables.records.TicketBetlineRecord;

import java.util.List;
import java.util.Map;

public interface TicketBetlineJooqService {

    TicketBetlineRecord create(TicketBetlineRequest request);

    TicketBetlineRecord findById(Long id);

    List<TicketBetlineRecord> findAll();

    TicketBetlineRecord update(Long id, TicketBetlineRequest request);


}
