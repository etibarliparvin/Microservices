package az.topaz.backofficeservice.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    Long id;
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    Long statusId;
    LocalDateTime createdDate;
}
