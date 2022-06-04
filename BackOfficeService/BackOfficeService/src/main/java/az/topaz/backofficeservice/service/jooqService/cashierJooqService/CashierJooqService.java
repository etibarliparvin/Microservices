package az.topaz.backofficeservice.service.jooqService.cashierJooqService;

import az.topaz.backofficeservice.dto.request.CashierRequest;
import nu.studer.sample.tables.records.CashierRecord;

import java.util.List;

public interface CashierJooqService {

    CashierRecord create(CashierRequest request);

    CashierRecord findById(Long id);

    List<CashierRecord> findAll();

    CashierRecord update(Long id, CashierRequest request);
}
