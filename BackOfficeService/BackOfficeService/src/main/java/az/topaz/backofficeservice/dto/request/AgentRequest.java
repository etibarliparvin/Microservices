package az.topaz.backofficeservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AgentRequest {

    Long operatorId;
    String agentCode;
    String serialNumber;
    String fullName;
    String address;
    String phone;
    String mobile;
    String email;
    Long cityId;
    Long statusId;
    String voen;
    String curatorEmail;
    String curatorPhone;
    String username;
    String password;
    LocalDateTime createdAt;
    LocalDateTime lastLogin;
    String type;
    BigDecimal totalCurBalance;
    BigDecimal debitCredit;
    BigDecimal extraDebitCredit;
    BigDecimal totalPermanentBalance;
}
