package az.topaz.backofficeservice.service.businessService.taxBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
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
    public CommonResponse create(TaxRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(taxResponseMapper.toResponse(taxJooqService.create(request)));
        return response;
    }

    @Override
    public CommonResponse findById(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(taxResponseMapper.toResponse(taxJooqService.findById(id)));
        return response;
    }

    @Override
    public CommonResponse findAll() {
        CommonResponse response = new CommonResponse();
        response.setItem(taxResponseMapper.toResponseList(taxJooqService.findAll()));
        return response;
    }

    @Override
    public CommonResponse update(Long id, TaxRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(taxResponseMapper.toResponse(taxJooqService.update(id, request)));
        return response;
    }
}
