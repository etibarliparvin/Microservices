package az.topaz.backofficeservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    Long statusId;
    LocalDateTime createdDate;
}
