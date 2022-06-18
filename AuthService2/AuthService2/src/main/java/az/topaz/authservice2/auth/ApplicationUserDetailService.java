package az.topaz.authservice2.auth;

import az.topaz.authservice2.dto.response.UserResponse;
import az.topaz.authservice2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationUserDetailService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserResponse user = userService.findByUsername(username);
        if (user != null) {
            return new ApplicationUserDetails(user);
        }
        throw new UsernameNotFoundException("User detail not found");
    }
}
