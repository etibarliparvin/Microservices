package az.topaz.backofficeservice.mapper.businessMapper;

import az.topaz.backofficeservice.dto.response.TaxResponse;
import nu.studer.sample.public_.tables.records.TaxRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaxResponseMapper implements ResponseMapper<TaxRecord, TaxResponse> {

    @Override
    public TaxResponse toResponse(TaxRecord record) {
        TaxResponse response = new TaxResponse();
        response.setId(record.getId());
        response.setType(record.getType());
        response.setValue(record.getValue());
        response.setStatus(record.getStatus());
        response.setOperatorId(record.getOperatorId());
        return response;
    }

    @Override
    public List<TaxResponse> toResponseList(List<TaxRecord> records) {
        List<TaxResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
