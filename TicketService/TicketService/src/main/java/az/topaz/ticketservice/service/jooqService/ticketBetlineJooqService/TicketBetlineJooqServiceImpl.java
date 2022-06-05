package az.topaz.ticketservice.service.jooqService.ticketBetlineJooqService;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import az.topaz.ticketservice.mapper.recordMapper.TicketBetlineRecordMapper;
import az.topaz.ticketservice.repository.ticketBetline.TicketBetlineRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketBetlineJooqServiceImpl implements TicketBetlineJooqService {

    private final TicketBetlineRecordMapper ticketBetlineRecordMapper;
    private final TicketBetlineRepository<TicketBetlineRecord> ticketBetlineRepository;


    @Override
    public TicketBetlineRecord create(TicketBetlineRequest request) {
        return ticketBetlineRepository.create(ticketBetlineRecordMapper.toRecord(request));
    }

    @Override
    public TicketBetlineRecord findById(Long id) {
        return ticketBetlineRepository.findById(id);
    }

    @Override
    public List<TicketBetlineRecord> findAll() {
        return ticketBetlineRepository.findAll();
    }

    @Override
    public List<TicketBetlineRecord> findAllByTicketId(Long id) {
        return ticketBetlineRepository.getAllBetlinesWithTicketId(id);
    }

    @Override
    public TicketBetlineRecord update(Long id, TicketBetlineRequest request) {
        return ticketBetlineRepository.update(id, ticketBetlineRecordMapper.toRecord(request));
    }
}
