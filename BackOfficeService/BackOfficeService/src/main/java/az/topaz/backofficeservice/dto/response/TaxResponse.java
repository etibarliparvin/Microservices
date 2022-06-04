package az.topaz.backofficeservice.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaxResponse {

    Long id;
    String type;
    BigDecimal value;
    Boolean status;
    Long operatorId;
}
