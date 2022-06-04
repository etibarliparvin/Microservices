package az.topaz.backofficeservice.mapper.businessMapper;

import az.topaz.backofficeservice.dto.response.OperatorResponse;
import nu.studer.sample.tables.records.OperatorRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OperatorResponseMapper implements ResponseMapper<OperatorRecord, OperatorResponse> {

    @Override
    public OperatorResponse toResponse(OperatorRecord record) {
        OperatorResponse response = new OperatorResponse();
        response.setId(record.getId());
        response.setName(record.getName());
        response.setWebsite(record.getWebsite());
        response.setAddress(record.getAddress());
        response.setPhone(record.getPhone());
        response.setFax(record.getFax());
        response.setEmail(record.getEmail());
        response.setAgents(record.getAgents());
        response.setType(record.getType());
        response.setTerminals(record.getTerminals());
        response.setCashiers(record.getCashiers());
        response.setOnlinePlayers(record.getOnlinePlayers());
        response.setStatusId(record.getStatusId());
        response.setTicketExpPeriod(record.getTicketExpPeriod());
        response.setTicketExpPeriodType(record.getTicketExpPeriodType());
        response.setMaxStakeAmount(record.getMaxStakeAmount());
        response.setMinStakeAmount(record.getMinStakeAmount());
        response.setMaxAmountPerVoucher(record.getMaxAmountPerVoucher());
        response.setPayoutLimit(record.getPayoutLimit());
        response.setVoucherAmount(record.getVoucherAmount());
        response.setAvailableCreditLimit(record.getAvailableCreditLimit());
        response.setOperatorType(record.getOperatorType());
        response.setWinningTax(record.getWinningTax());
        response.setCreatedDate(record.getCreatedDate());
        return response;
    }

    @Override
    public List<OperatorResponse> toResponseList(List<OperatorRecord> records) {
        List<OperatorResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
