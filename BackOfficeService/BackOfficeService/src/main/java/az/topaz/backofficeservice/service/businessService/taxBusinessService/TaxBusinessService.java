package az.topaz.backofficeservice.service.businessService.taxBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.TaxRequest;

public interface TaxBusinessService {

    CommonResponse create(TaxRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, TaxRequest request);
}
