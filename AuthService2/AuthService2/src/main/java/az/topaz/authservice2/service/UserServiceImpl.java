package az.topaz.authservice2.service;

import az.topaz.authservice2.dto.response.UserResponse;
import az.topaz.authservice2.mapper.UserMapper;
import az.topaz.authservice2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
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

    @Override
    public UserResponse create(UserRecord record) {
        return userMapper.toResponse(userRepository.create(record));
    }
}
