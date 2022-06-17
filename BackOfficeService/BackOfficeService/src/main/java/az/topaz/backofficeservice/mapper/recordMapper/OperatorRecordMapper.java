package az.topaz.backofficeservice.mapper.recordMapper;

import az.topaz.backofficeservice.dto.request.OperatorRequest;
import nu.studer.sample.public_.tables.records.OperatorRecord;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OperatorRecordMapper implements RecordMapper<OperatorRequest, OperatorRecord> {

    @Override
    public OperatorRecord toRecord(OperatorRequest request) {
        OperatorRecord record = new OperatorRecord();
        record.setName(request.getName());
        record.setWebsite(request.getWebsite());
        record.setAddress(request.getAddress());
        record.setPhone(request.getPhone());
        record.setFax(request.getFax());
        record.setEmail(request.getEmail());
        record.setAgents(request.getAgents());
        record.setType(request.getType());
        record.setTerminals(request.getTerminals());
        record.setCashiers(request.getCashiers());
        record.setOnlinePlayers(request.getOnlinePlayers());
        record.setStatusId(request.getStatusId());
        record.setTicketExpPeriod(request.getTicketExpPeriod());
        record.setTicketExpPeriodType(request.getTicketExpPeriodType());
        record.setMaxStakeAmount(request.getMaxStakeAmount());
        record.setMinStakeAmount(request.getMinStakeAmount());
        record.setMaxAmountPerVoucher(request.getMaxAmountPerVoucher());
        record.setPayoutLimit(request.getPayoutLimit());
        record.setVoucherAmount(request.getVoucherAmount());
        record.setAvailableCreditLimit(request.getAvailableCreditLimit());
        record.setOperatorType(request.getOperatorType());
        record.setWinningTax(request.getWinningTax());
        record.setCreatedDate(request.getCreatedDate());
        return record;
    }

    public OperatorRecord toRecordUpdate(Long id, OperatorRequest request) {
        OperatorRecord record = new OperatorRecord();
        if (!ObjectUtils.isEmpty(id))
            record.setId(id);
        if (!ObjectUtils.isEmpty(request.getName()))
            record.setName(request.getName());
        if (!ObjectUtils.isEmpty(request.getWebsite()))
            record.setWebsite(request.getWebsite());
        if (!ObjectUtils.isEmpty(request.getAddress()))
            record.setAddress(request.getAddress());
        if (!ObjectUtils.isEmpty(request.getPhone()))
            record.setPhone(request.getPhone());
        if (!ObjectUtils.isEmpty(request.getFax()))
            record.setFax(request.getFax());
        if (!ObjectUtils.isEmpty(request.getEmail()))
            record.setEmail(request.getEmail());
        if (!ObjectUtils.isEmpty(request.getAgents()))
            record.setAgents(request.getAgents());
        if (!ObjectUtils.isEmpty(request.getType()))
            record.setType(request.getType());
        if (!ObjectUtils.isEmpty(request.getTerminals()))
            record.setTerminals(request.getTerminals());
        if (!ObjectUtils.isEmpty(request.getCashiers()))
            record.setCashiers(request.getCashiers());
        if (!ObjectUtils.isEmpty(request.getOnlinePlayers()))
            record.setOnlinePlayers(request.getOnlinePlayers());
        if (!ObjectUtils.isEmpty(request.getStatusId()))
            record.setStatusId(request.getStatusId());
        if (!ObjectUtils.isEmpty(request.getTicketExpPeriod()))
            record.setTicketExpPeriod(request.getTicketExpPeriod());
        if (!ObjectUtils.isEmpty(request.getTicketExpPeriodType()))
            record.setTicketExpPeriodType(request.getTicketExpPeriodType());
        if (!ObjectUtils.isEmpty(request.getMaxStakeAmount()))
            record.setMaxStakeAmount(request.getMaxStakeAmount());
        if (!ObjectUtils.isEmpty(request.getMinStakeAmount()))
            record.setMinStakeAmount(request.getMinStakeAmount());
        if (!ObjectUtils.isEmpty(request.getMaxAmountPerVoucher()))
            record.setMaxAmountPerVoucher(request.getMaxAmountPerVoucher());
        if (!ObjectUtils.isEmpty(request.getPayoutLimit()))
            record.setPayoutLimit(request.getPayoutLimit());
        if (!ObjectUtils.isEmpty(request.getVoucherAmount()))
            record.setVoucherAmount(request.getVoucherAmount());
        if (!ObjectUtils.isEmpty(request.getAvailableCreditLimit()))
            record.setAvailableCreditLimit(request.getAvailableCreditLimit());
        if (!ObjectUtils.isEmpty(request.getOperatorType()))
            record.setOperatorType(request.getOperatorType());
        if (!ObjectUtils.isEmpty(request.getWinningTax()))
            record.setWinningTax(request.getWinningTax());
        if (!ObjectUtils.isEmpty(request.getCreatedDate()))
            record.setCreatedDate(request.getCreatedDate());
        return record;
    }

    @Override
    public List<OperatorRecord> toRecordList(List<OperatorRequest> requests) {
        List<OperatorRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
