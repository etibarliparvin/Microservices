package az.topaz.backofficeservice.service.businessService.operatorBusinessService;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import az.topaz.backofficeservice.dto.response.OperatorResponse;

import java.util.List;

public interface OperatorBusinessService {

    OperatorResponse create(OperatorRequest request);

    OperatorResponse findById(Long id);

    List<OperatorResponse> findAll();

    OperatorResponse update(Long id, OperatorRequest request);

    Long getCountOfCashiers(Long id);
}
