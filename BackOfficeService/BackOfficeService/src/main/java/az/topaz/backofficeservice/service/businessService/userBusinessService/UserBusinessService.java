package az.topaz.backofficeservice.service.businessService.userBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.dto.request.UserRequest;

public interface UserBusinessService {

    CommonResponse create(UserRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, UserRequest request);
}
