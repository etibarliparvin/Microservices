package az.topaz.backofficeservice.service.jooqService.cashierJooqService;

import az.topaz.backofficeservice.dto.request.CashierRequest;
import az.topaz.backofficeservice.mapper.recordMapper.CashierRecordMapper;
import az.topaz.backofficeservice.repository.cashier.CashierRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.CashierRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CashierJooqServiceImpl implements CashierJooqService{

    private final CashierRecordMapper cashierRecordMapper;
    private final CashierRepository<CashierRecord> cashierRepository;

    @Override
    public CashierRecord create(CashierRequest request) {
        return cashierRepository.create(cashierRecordMapper.toRecord(request));
    }

    @Override
    public CashierRecord findById(Long id) {
        return cashierRepository.findById(id);
    }

    @Override
    public List<CashierRecord> findAll() {
        return cashierRepository.findAll();
    }

    @Override
    public CashierRecord update(Long id, CashierRequest request) {
        return cashierRepository.update(id, cashierRecordMapper.toRecord(request));
    }
}
