package az.topaz.ticketservice.mapper.businessMapper;

import az.topaz.ticketservice.dto.response.TicketBetlineResponse;
import nu.studer.sample.tables.records.TicketBetlineRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TicketBetlineResponseMapper implements ResponseMapper<TicketBetlineRecord, TicketBetlineResponse> {
    @Override
    public TicketBetlineResponse toResponse(TicketBetlineRecord record) {
        TicketBetlineResponse response = new TicketBetlineResponse();
        response.setId(record.getId());
        response.setTicketId(record.getTicketId());
        response.setEvent(record.getEvent());
        response.setSportName(record.getSportName());
        response.setLanguageName(record.getLanguageName());
        response.setCategoryName(record.getCategoryName());
        response.setEventStartTime(record.getEventStartTime());
        return response;
    }

    @Override
    public List<TicketBetlineResponse> toResponseList(List<TicketBetlineRecord> records) {
        List<TicketBetlineResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
