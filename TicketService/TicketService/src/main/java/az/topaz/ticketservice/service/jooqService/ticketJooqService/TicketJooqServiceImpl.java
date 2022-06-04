package az.topaz.ticketservice.service.jooqService.ticketJooqService;

import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.mapper.recordMapper.TicketRecordMapper;
import az.topaz.ticketservice.repository.ticket.TicketRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TicketJooqServiceImpl implements  TicketJooqService{

    private final TicketRecordMapper ticketRecordMapper;
    private final TicketRepository<TicketRecord> ticketRepository;


    @Override
    public TicketRecord create(TicketRequest request) {
        return ticketRepository.create(ticketRecordMapper.toRecord(request));    }

    @Override
    public TicketRecord findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public List<TicketRecord> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public TicketRecord update(Long id, TicketRequest request) {
        return ticketRepository.update(id, ticketRecordMapper.toRecord(request));
    }


}
