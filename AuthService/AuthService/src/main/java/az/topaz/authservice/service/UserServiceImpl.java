package az.topaz.authservice.service;

import az.topaz.authservice.dto.response.UserResponse;
import az.topaz.authservice.mapper.UserMapper;
import az.topaz.authservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;


    @Override
    public UserResponse findByUsername(String username) {
        return userMapper.toResponse(userRepository.findByUsername(username));
    }
}
