package az.topaz.backofficeservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperatorRequest {

    String name;
    String website;
    String address;
    String phone;
    String fax;
    String email;
    Long agents;
    String type;
    Long terminals;
    Long cashiers;
    Long onlinePlayers;
    Long statusId;
    LocalDateTime ticketExpPeriod;
    String ticketExpPeriodType;
    BigDecimal maxStakeAmount;
    BigDecimal minStakeAmount;
    BigDecimal maxAmountPerVoucher;
    BigDecimal payoutLimit;
    BigDecimal voucherAmount;
    BigDecimal availableCreditLimit;
    String operatorType;
    BigDecimal winningTax;
    LocalDateTime createdDate;
}
