package az.topaz.backofficeservice.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CashierResponse {

    Long id;
    String cashierCode;
    String fullName;
    Long statusId;
    Long cityId;
    Long operatorId;
    String address;
    String mobile;
    String phone;
    String email;
    String curatorEmail;
    String curatorPhone;
    Long zoneId;
    Long regionId;
    LocalDateTime operationStartHour;
    LocalDateTime operationEndHour;
    BigDecimal currentBalance;
    BigDecimal permanentBalance;
    BigDecimal nextPermanentBalance;
    BigDecimal extraDebitCredit;
    BigDecimal debitCredit;
    BigDecimal currentDeptCredit;
    BigDecimal maxPaymentAmount;
    BigDecimal maxVoucherAmount;
    BigDecimal minVoucherAmount;
    BigDecimal payoutLimit;
    String payoutLimitType;
    BigDecimal voucherAmount;
    String username;
    String password;
    String macAddress;
    LocalDateTime createdAt;
    LocalDateTime lastLogin;
    LocalDateTime lastLogout;
    BigDecimal maxBettingStakeAmount;
    BigDecimal minBettingStakeAmount;
    Boolean testUser;
    Boolean frozen;
    String type;
    Long cashierProfileStatusId;
    BigDecimal increaseDebt;
}
