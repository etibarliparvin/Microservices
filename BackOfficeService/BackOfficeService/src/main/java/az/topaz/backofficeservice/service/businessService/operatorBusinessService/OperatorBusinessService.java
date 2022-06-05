package az.topaz.backofficeservice.service.businessService.operatorBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.dto.response.OperatorResponse;

import java.util.List;

public interface OperatorBusinessService {

    CommonResponse create(OperatorRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, OperatorRequest request);

    CommonResponse getCountOfCashiers(Long id);
}
