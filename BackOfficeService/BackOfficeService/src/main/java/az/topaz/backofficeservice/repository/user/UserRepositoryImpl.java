package az.topaz.backofficeservice.repository.user;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.user_schema.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static nu.studer.sample.user_schema.tables.User.USER;

@Repository
@RequiredArgsConstructor
public class    UserRepositoryImpl implements UserRepository<UserRecord> {

    private final DSLContext context;

    @Override
    public UserRecord create(UserRecord record) {
        return context.insertInto(USER)
                .set(record)
                .returning()
                .fetchOneInto(UserRecord.class);
    }

    @Override
    public UserRecord findById(Long id) {
        return context.select()
                .from(USER)
                .where(USER.ID.eq(id))
                .fetchOneInto(UserRecord.class);
    }

    @Override
    public List<UserRecord> findAll() {
        return context.select()
                .from(USER)
                .fetchInto(UserRecord.class);
    }

    @Override
    public UserRecord update(Long id, UserRecord record) {
        return context.update(USER)
                .set(record)
                .where(USER.ID.eq(id))
                .returning()
                .fetchOneInto(UserRecord.class);
    }
}
