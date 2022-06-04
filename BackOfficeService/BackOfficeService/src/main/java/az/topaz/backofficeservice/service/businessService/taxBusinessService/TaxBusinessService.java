package az.topaz.backofficeservice.service.businessService.taxBusinessService;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.dto.response.TaxResponse;

import java.util.List;

public interface TaxBusinessService {

    TaxResponse create(TaxRequest request);

    TaxResponse findById(Long id);

    List<TaxResponse> findAll();

    TaxResponse update(Long id, TaxRequest request);
}
