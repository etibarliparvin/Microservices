package az.topaz.backofficeservice.service.jooqService.taxJooqService;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import nu.studer.sample.tables.records.TaxRecord;

import java.util.List;

public interface TaxJooqService {

    TaxRecord create(TaxRequest request);

    TaxRecord findById(Long id);

    List<TaxRecord> findAll();

    TaxRecord update(Long id, TaxRequest request);
}
