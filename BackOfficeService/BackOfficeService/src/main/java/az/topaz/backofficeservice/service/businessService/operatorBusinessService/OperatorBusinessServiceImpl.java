package az.topaz.backofficeservice.service.businessService.operatorBusinessService;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.dto.response.OperatorResponse;
import az.topaz.backofficeservice.mapper.businessMapper.OperatorResponseMapper;
import az.topaz.backofficeservice.mapper.recordMapper.OperatorRecordMapper;
import az.topaz.backofficeservice.service.jooqService.operatorJooqService.OperatorJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorBusinessServiceImpl implements OperatorBusinessService {

    private final OperatorResponseMapper operatorResponseMapper;
    private final OperatorJooqService operatorJooqService;

    @Override
    public OperatorResponse create(OperatorRequest request) {
        return operatorResponseMapper.toResponse(operatorJooqService.create(request));
    }

    @Override
    public OperatorResponse findById(Long id) {
        return operatorResponseMapper.toResponse(operatorJooqService.findById(id));
    }

    @Override
    public List<OperatorResponse> findAll() {
        return operatorResponseMapper.toResponseList(operatorJooqService.findAll());
    }

    @Override
    public OperatorResponse update(Long id, OperatorRequest request) {
        return operatorResponseMapper.toResponse(operatorJooqService.update(id, request));
    }

    @Override
    public Long getCountOfCashiers(Long id) {
        return operatorJooqService.getCountOfCashiers(id);
    }
}
