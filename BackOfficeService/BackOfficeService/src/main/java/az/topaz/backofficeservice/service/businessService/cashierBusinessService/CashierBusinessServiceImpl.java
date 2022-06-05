package az.topaz.backofficeservice.service.businessService.cashierBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.CashierRequest;
import az.topaz.backofficeservice.dto.response.CashierResponse;
import az.topaz.backofficeservice.mapper.businessMapper.CashierResponseMapper;
import az.topaz.backofficeservice.service.jooqService.cashierJooqService.CashierJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CashierBusinessServiceImpl implements CashierBusinessService {

    private final CashierResponseMapper cashierResponseMapper;
    private final CashierJooqService cashierJooqService;

    @Override
    public CommonResponse create(CashierRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(cashierResponseMapper.toResponse(cashierJooqService.create(request)));
        return response;
    }

    @Override
    public CommonResponse findById(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(cashierResponseMapper.toResponse(cashierJooqService.findById(id)));
        return response;
    }

    @Override
    public CommonResponse findAll() {
        CommonResponse response = new CommonResponse();
        response.setItem(cashierResponseMapper.toResponseList(cashierJooqService.findAll()));
        return response;
    }

    @Override
    public CommonResponse update(Long id, CashierRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(cashierResponseMapper.toResponse(cashierJooqService.update(id, request)));
        return response;
    }
}
