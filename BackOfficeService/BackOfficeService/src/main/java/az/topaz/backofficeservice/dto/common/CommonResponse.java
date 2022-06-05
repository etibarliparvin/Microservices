package az.topaz.backofficeservice.dto.common;

import lombok.Data;

@Data
public class CommonResponse {
    private Long time = System.currentTimeMillis();
    private String status = "Success";
    private Object item;
    private CommonMessage errorMessage;
}
