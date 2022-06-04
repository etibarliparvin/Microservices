package az.topaz.backofficeservice.service.businessService.taxBusinessService;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import az.topaz.backofficeservice.dto.response.TaxResponse;
import az.topaz.backofficeservice.mapper.businessMapper.TaxResponseMapper;
import az.topaz.backofficeservice.service.jooqService.taxJooqService.TaxJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaxBusinessServiceImpl implements TaxBusinessService {

    private final TaxResponseMapper taxResponseMapper;
    private final TaxJooqService taxJooqService;

    @Override
    public TaxResponse create(TaxRequest request) {
        return taxResponseMapper.toResponse(taxJooqService.create(request));
    }

    @Override
    public TaxResponse findById(Long id) {
        return taxResponseMapper.toResponse(taxJooqService.findById(id));
    }

    @Override
    public List<TaxResponse> findAll() {
        return taxResponseMapper.toResponseList(taxJooqService.findAll());
    }

    @Override
    public TaxResponse update(Long id, TaxRequest request) {
        return taxResponseMapper.toResponse(taxJooqService.update(id, request));
    }
}
