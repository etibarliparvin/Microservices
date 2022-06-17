package az.topaz.backofficeservice.service.businessService.operatorBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.mapper.businessMapper.OperatorResponseMapper;
import az.topaz.backofficeservice.service.jooqService.operatorJooqService.OperatorJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OperatorBusinessServiceImpl implements OperatorBusinessService {

    private final OperatorResponseMapper operatorResponseMapper;
    private final OperatorJooqService operatorJooqService;

    @Override
    public CommonResponse create(OperatorRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(operatorResponseMapper.toResponse(operatorJooqService.create(request)));
        return response;
    }

    @Override
    public CommonResponse findById(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(operatorResponseMapper.toResponse(operatorJooqService.findById(id)));
        return response;
    }

    @Override
    public CommonResponse findAll() {
        CommonResponse response = new CommonResponse();
        response.setItem(operatorResponseMapper.toResponseList(operatorJooqService.findAll()));
        return response;
    }

    @Override
    public CommonResponse update(Long id, OperatorRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(operatorResponseMapper.toResponse(operatorJooqService.update(id, request)));
        return response;
    }

    @Override
    public CommonResponse getCountOfCashiers(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(operatorJooqService.getCountOfCashiers(id));
        return response;
    }
}
