package az.topaz.backofficeservice.mapper.businessMapper;

import az.topaz.backofficeservice.dto.response.UserResponse;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserResponseMapper implements ResponseMapper<UserRecord, UserResponse> {

    @Override
    public UserResponse toResponse(UserRecord record) {
        UserResponse response = new UserResponse();
        response.setId(record.getId());
        response.setFirstName(record.getFirstName());
        response.setLastName(record.getLastName());
        response.setEmail(record.getEmail());
        response.setUsername(record.getUsername());
        response.setPassword(record.getPassword());
        response.setStatusId(record.getStatusId());
        response.setCreatedDate(record.getCreatedDate());
        return response;
    }

    @Override
    public List<UserResponse> toResponseList(List<UserRecord> records) {
        List<UserResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
