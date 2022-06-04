package az.topaz.backofficeservice.service.jooqService.operatorJooqService;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.mapper.recordMapper.OperatorRecordMapper;
import az.topaz.backofficeservice.repository.operator.OperatorRepository;
import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.OperatorRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorJooqServiceImpl implements OperatorJooqService {

    private final OperatorRecordMapper operatorRecordMapper;
    private final OperatorRepository<OperatorRecord> operatorRepository;

    @Override
    public OperatorRecord create(OperatorRequest request) {
        return operatorRepository.create(operatorRecordMapper.toRecord(request));
    }

    @Override
    public OperatorRecord findById(Long id) {
        return operatorRepository.findById(id);
    }

    @Override
    public List<OperatorRecord> findAll() {
        return operatorRepository.findAll();
    }

    @Override
    public OperatorRecord update(Long id, OperatorRequest request) {
        return operatorRepository.update(id, operatorRecordMapper.toRecordUpdate(id, request));
    }

    @Override
    public Long getCountOfCashiers(Long id) {
        return operatorRepository.countOfCashiers(id);
    }
}
