package az.topaz.ticketservice.mapper.businessMapper;

import java.util.List;

public interface ResponseMapper<Record, Response> {

    Response toResponse(Record record);

    List<Response> toResponseList(List<Record> records);
}
