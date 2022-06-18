package az.topaz.authservice2.dto.request;

import lombok.Data;

@Data
public class LoginRequest {

    private String username;
    private String password;
}
