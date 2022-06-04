package az.topaz.ticketservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketRequest {

    String barcode;
    String cashierCode;
    String betType;
    BigDecimal stakeAmount;
    BigDecimal totalWinAmount;
    BigDecimal totalPayAmount;
    LocalDateTime betTime;
    String ticketStatus;
    BigDecimal odd;
}
