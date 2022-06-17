package az.topaz.backofficeservice.service.jooqService.userJooqService;

import az.topaz.backofficeservice.dto.request.UserRequest;
import nu.studer.sample.user_schema.tables.records.UserRecord;

import java.util.List;

public interface UserJooqService {

    UserRecord create(UserRequest request);

    UserRecord findById(Long id);

    List<UserRecord> findAll();

    UserRecord update(Long id, UserRequest request);
}
