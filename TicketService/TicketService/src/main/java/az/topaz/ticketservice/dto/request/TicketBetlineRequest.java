package az.topaz.ticketservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketBetlineRequest {

    Long ticketId;
    String event;
    String sportName;
    String languageName;
    String categoryName;
    LocalDateTime eventStartTime;
}
