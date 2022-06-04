package az.topaz.ticketservice.mapper.recordMapper;

import java.util.List;

public interface RecordMapper<Request, Record> {

    Record toRecord(Request request);

    List<Record> toRecordList(List<Request> requests);
}
