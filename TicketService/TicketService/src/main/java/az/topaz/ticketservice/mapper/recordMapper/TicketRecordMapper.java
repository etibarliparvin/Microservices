package az.topaz.ticketservice.mapper.recordMapper;

import az.topaz.ticketservice.dto.request.TicketRequest;
import az.topaz.ticketservice.dto.response.TicketResponse;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketRecordMapper implements RecordMapper<TicketRequest, TicketRecord> {
    @Override
    public TicketRecord toRecord(TicketRequest request) {
        TicketRecord record = new TicketRecord();
        record.setBarcode(request.getBarcode());
        record.setCashierCode(request.getCashierCode());
        record.setBetType(request.getBetType());
        record.setStakeAmount(request.getStakeAmount());
        record.setTotalWinAmount(request.getTotalWinAmount());
        record.setTotalPayAmount(request.getTotalPayAmount());
        record.setBetTime(request.getBetTime());
        record.setTicketStatus(request.getTicketStatus());
        record.setOdd(request.getOdd());
        return record;
    }

    @Override
    public List<TicketRecord> toRecordList(List<TicketRequest> requests) {
        List<TicketRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
