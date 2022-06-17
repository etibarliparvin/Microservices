package az.topaz.backofficeservice.service.jooqService.userJooqService;

import az.topaz.backofficeservice.dto.request.UserRequest;
import az.topaz.backofficeservice.mapper.recordMapper.UserRecordMapper;
import az.topaz.backofficeservice.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserJooqServiceImpl implements UserJooqService {

    private final UserRecordMapper userRecordMapper;
    private final UserRepository<UserRecord> userRepository;

    @Override
    public UserRecord create(UserRequest request) {
        return userRepository.create(userRecordMapper.toRecord(request));
    }

    @Override
    public UserRecord findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserRecord> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserRecord update(Long id, UserRequest request) {
        return userRepository.update(id, userRecordMapper.toRecord(request));
    }
}
