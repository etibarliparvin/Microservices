package az.topaz.authservice2.mapper;

import az.topaz.authservice2.dto.request.RegisterRequest;
import az.topaz.authservice2.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

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

    public UserRecord toRecord(RegisterRequest request) {
        UserRecord record = new UserRecord();
        record.setFirstName(request.getFirstName());
        record.setLastName(request.getLastName());
        record.setEmail(request.getEmail());
        record.setUsername(request.getUsername());
        record.setPassword(passwordEncoder.encode(request.getPassword()));
        record.setCreatedDate(LocalDateTime.now());
        record.setStatusId(1L);
        return record;
    }
}
