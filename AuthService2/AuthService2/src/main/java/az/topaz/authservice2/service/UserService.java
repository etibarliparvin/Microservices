package az.topaz.authservice2.service;

import az.topaz.authservice2.dto.response.UserResponse;
import nu.studer.sample.user_schema.tables.records.UserRecord;

public interface UserService {

    UserResponse findByUsername(String username);

    UserResponse create(UserRecord record);
}
