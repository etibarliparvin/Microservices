package az.topaz.authservice.jwt;

import com.google.common.net.HttpHeaders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtConfig {

    @Value("${jwt.app.secret}")
    private String secretKey;

    @Value("${jwt.app.token-prefix}")
    private String tokenPrefix;

    @Value("${jwt.app.expiration.date}")
    private Integer tokenExpirationAfterDays;

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
