package az.topaz.ticketservice.mapper.recordMapper;

import az.topaz.ticketservice.dto.request.TicketBetlineRequest;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketBetlineRecordMapper implements RecordMapper<TicketBetlineRequest, TicketBetlineRecord> {
    @Override
    public TicketBetlineRecord toRecord(TicketBetlineRequest request) {
        TicketBetlineRecord record = new TicketBetlineRecord();
        record.setTicketId(request.getTicketId());
        record.setEvent(request.getEvent());
        record.setSportName(request.getSportName());
        record.setLanguageName(request.getLanguageName());
        record.setCategoryName(request.getCategoryName());
        record.setEventStartTime(request.getEventStartTime());
        return record;
    }

    @Override
    public List<TicketBetlineRecord> toRecordList(List<TicketBetlineRequest> requests) {
        List<TicketBetlineRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
