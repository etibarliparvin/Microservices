package az.topaz.backofficeservice.mapper.recordMapper;

import az.topaz.backofficeservice.dto.request.UserRequest;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserRecordMapper implements RecordMapper<UserRequest, UserRecord> {

    @Override
    public UserRecord toRecord(UserRequest request) {
        UserRecord record = new UserRecord();
        record.setFirstName(request.getFirstName());
        record.setLastName(request.getLastName());
        record.setEmail(request.getEmail());
        record.setUsername(request.getUsername());
        record.setPassword(request.getPassword());
        record.setStatusId(request.getStatusId());
        record.setCreatedDate(request.getCreatedDate());
        return record;
    }

    @Override
    public List<UserRecord> toRecordList(List<UserRequest> requests) {
        List<UserRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
