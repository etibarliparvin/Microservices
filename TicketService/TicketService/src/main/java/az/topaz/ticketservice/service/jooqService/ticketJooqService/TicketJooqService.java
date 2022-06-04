package az.topaz.ticketservice.service.jooqService.ticketJooqService;

import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.repository.ticketBetline.TicketBetlineRepository;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import nu.studer.sample.tables.records.TicketRecord;

import java.util.List;
import java.util.Map;

public interface TicketJooqService {

    TicketRecord create(TicketRequest request);

    TicketRecord findById(Long id);

    List<TicketRecord> findAll();

    TicketRecord update(Long id, TicketRequest request);


}
