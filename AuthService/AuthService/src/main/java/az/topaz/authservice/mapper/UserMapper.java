package az.topaz.authservice.mapper;

import az.topaz.authservice.dto.response.UserResponse;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

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
}
