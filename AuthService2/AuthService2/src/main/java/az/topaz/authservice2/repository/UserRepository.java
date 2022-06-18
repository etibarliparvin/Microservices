package az.topaz.authservice2.repository;

import nu.studer.sample.user_schema.tables.records.UserRecord;

public interface UserRepository {

    UserRecord findByUsername(String username);

    UserRecord create(UserRecord userRecord);
}
