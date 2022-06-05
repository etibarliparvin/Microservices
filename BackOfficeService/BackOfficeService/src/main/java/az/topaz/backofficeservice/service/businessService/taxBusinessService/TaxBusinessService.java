package az.topaz.backofficeservice.service.businessService.taxBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.dto.response.TaxResponse;

import java.util.List;

public interface TaxBusinessService {

    CommonResponse create(TaxRequest request);

    CommonResponse findById(Long id);

    CommonResponse findAll();

    CommonResponse update(Long id, TaxRequest request);
}
