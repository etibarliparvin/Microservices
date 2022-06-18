package az.topaz.authservice2.repository;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.user_schema.Tables.USER;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final DSLContext context;

    @Override
    public UserRecord findByUsername(String username) {
        return context.select()
                .from(USER)
                .where(USER.USERNAME.eq(username))
                .fetchOneInto(UserRecord.class);
    }

    @Override
    public UserRecord create(UserRecord userRecord) {
        return context.insertInto(USER)
                .set(userRecord)
                .returning()
                .fetchOneInto(UserRecord.class);
    }
}
