package az.topaz.backofficeservice.mapper.recordMapper;

import az.topaz.backofficeservice.dto.request.TaxRequest;
import nu.studer.sample.public_.tables.records.TaxRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaxRecordMapper implements RecordMapper<TaxRequest, TaxRecord> {

    @Override
    public TaxRecord toRecord(TaxRequest request) {
        TaxRecord record = new TaxRecord();
        record.setType(request.getType());
        record.setValue(request.getValue());
        record.setStatus(request.getStatus());
        record.setOperatorId(request.getOperatorId());
        return record;
    }

    @Override
    public List<TaxRecord> toRecordList(List<TaxRequest> requests) {
        List<TaxRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
