package az.topaz.authservice.repository;

import nu.studer.sample.user_schema.tables.User;
import nu.studer.sample.user_schema.tables.records.UserRecord;

public interface UserRepository {

    UserRecord findByUsername(String username);

    UserRecord create(UserRecord userRecord);
}
