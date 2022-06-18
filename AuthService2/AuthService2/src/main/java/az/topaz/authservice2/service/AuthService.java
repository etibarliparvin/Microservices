package az.topaz.authservice2.service;

import az.topaz.authservice2.dto.request.LoginRequest;
import az.topaz.authservice2.dto.request.RegisterRequest;
import az.topaz.authservice2.dto.response.JwtResponse;
import az.topaz.authservice2.dto.response.UserResponse;
import az.topaz.authservice2.jwt.JwtUtils;
import az.topaz.authservice2.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final UserService userService;
    private final UserMapper userMapper;

    public JwtResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtils.generateToken(authentication);
        return new JwtResponse(token);
    }

    public UserResponse register(RegisterRequest request) {
        UserRecord record = userMapper.toRecord(request);
        return userService.create(userMapper.toRecord(request));
    }
}
