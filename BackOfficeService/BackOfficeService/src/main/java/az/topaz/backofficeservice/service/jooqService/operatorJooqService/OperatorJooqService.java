package az.topaz.backofficeservice.service.jooqService.operatorJooqService;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import nu.studer.sample.tables.records.OperatorRecord;

import java.util.List;

public interface OperatorJooqService {

    OperatorRecord create(OperatorRequest request);

    OperatorRecord findById(Long id);

    List<OperatorRecord> findAll();

    OperatorRecord update(Long id, OperatorRequest request);

    Long getCountOfCashiers(Long id);
}
