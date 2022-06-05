package az.topaz.backofficeservice.service.businessService.cashierBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.CashierRequest;
import az.topaz.backofficeservice.dto.response.CashierResponse;

import java.util.List;

public interface CashierBusinessService {

    CommonResponse create(CashierRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, CashierRequest request);
}
