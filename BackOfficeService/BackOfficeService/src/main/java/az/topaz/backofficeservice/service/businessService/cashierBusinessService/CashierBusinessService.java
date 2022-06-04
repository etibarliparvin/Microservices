package az.topaz.backofficeservice.service.businessService.cashierBusinessService;

import az.topaz.backofficeservice.dto.request.CashierRequest;
import az.topaz.backofficeservice.dto.response.CashierResponse;

import java.util.List;

public interface CashierBusinessService {

    CashierResponse create(CashierRequest request);

    CashierResponse findById(Long id);

    List<CashierResponse> findAll();

    CashierResponse update(Long id, CashierRequest request);
}
