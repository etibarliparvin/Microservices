package az.topaz.ticketservice.mapper.businessMapper;

import az.topaz.ticketservice.dto.response.TicketResponse;
import nu.studer.sample.tables.records.TicketRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketResponseMapper implements ResponseMapper<TicketRecord, TicketResponse> {
    @Override
    public TicketResponse toResponse(TicketRecord record) {
        TicketResponse response = new TicketResponse();
        response.setId(record.getId());
        response.setBarcode(record.getBarcode());
        response.setCashierCode(record.getCashierCode());
        response.setBetType(record.getBetType());
        response.setStakeAmount(record.getStakeAmount());
        response.setTotalWinAmount(record.getTotalWinAmount());
        response.setTotalPayAmount(record.getTotalPayAmount());
        response.setBetTime(record.getBetTime());
        response.setTicketStatus(record.getTicketStatus());
        response.setOdd(record.getOdd());
        return response;
    }

    @Override
    public List<TicketResponse> toResponseList(List<TicketRecord> records) {
        List<TicketResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
