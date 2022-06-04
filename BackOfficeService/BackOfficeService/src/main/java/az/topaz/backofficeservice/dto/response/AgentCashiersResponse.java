package az.topaz.backofficeservice.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AgentCashiersResponse {

    AgentResponse agentResponse;
    List<CashierResponse> cashierResponses;
}
