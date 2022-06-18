package az.topaz.authservice.service;

import az.topaz.authservice.jwt.JwtUtils;
import az.topaz.authservice.payload.request.LoginRequest;
import az.topaz.authservice.payload.request.RegisterRequest;
import az.topaz.authservice.payload.response.JwtResponse;
import az.topaz.authservice.payload.response.RegisterResponse;
import az.topaz.authservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public JwtResponse login(LoginRequest request) {
        // user record
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtils.generateToken(authentication);
        return new JwtResponse(token);
    }

    public RegisterResponse registerUser(RegisterRequest request) {
        UserRecord userRecord = new UserRecord();
        userRecord.setFirstName(request.getFirstName());
        userRecord.setLastName(request.getLastName());
        userRecord.setEmail(request.getEmail());
        userRecord.setPassword(passwordEncoder.encode(request.getPassword()));
        userRecord.setCreatedDate(LocalDateTime.now());
        userRepository.create(userRecord);
        return new RegisterResponse("Success");
    }
}
