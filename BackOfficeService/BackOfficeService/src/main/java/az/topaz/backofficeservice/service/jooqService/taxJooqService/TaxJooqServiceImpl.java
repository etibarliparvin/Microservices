package az.topaz.backofficeservice.service.jooqService.taxJooqService;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.mapper.recordMapper.TaxRecordMapper;
import az.topaz.backofficeservice.repository.tax.TaxRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.TaxRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaxJooqServiceImpl implements TaxJooqService {

    private final TaxRecordMapper taxRecordMapper;
    private final TaxRepository<TaxRecord> taxRepository;

    @Override
    public TaxRecord create(TaxRequest request) {
        return taxRepository.create(taxRecordMapper.toRecord(request));
    }

    @Override
    public TaxRecord findById(Long id) {
        return taxRepository.findById(id);
    }

    @Override
    public List<TaxRecord> findAll() {
        return taxRepository.findAll();
    }

    @Override
    public TaxRecord update(Long id, TaxRequest request) {
        return taxRepository.update(id, taxRecordMapper.toRecord(request));
    }
}
