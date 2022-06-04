package az.topaz.backofficeservice.service.businessService.cashierBusinessService;

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
    public CashierResponse create(CashierRequest request) {
        return cashierResponseMapper.toResponse(cashierJooqService.create(request));
    }

    @Override
    public CashierResponse findById(Long id) {
        return cashierResponseMapper.toResponse(cashierJooqService.findById(id));
    }

    @Override
    public List<CashierResponse> findAll() {
        return cashierResponseMapper.toResponseList(cashierJooqService.findAll());
    }

    @Override
    public CashierResponse update(Long id, CashierRequest request) {
        return cashierResponseMapper.toResponse(cashierJooqService.update(id, request));
    }
}
