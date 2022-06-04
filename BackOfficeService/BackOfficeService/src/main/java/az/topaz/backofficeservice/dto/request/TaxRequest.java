package az.topaz.backofficeservice.dto.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaxRequest {

    String type;
    BigDecimal value;
    Boolean status;
    Long operatorId;
}
