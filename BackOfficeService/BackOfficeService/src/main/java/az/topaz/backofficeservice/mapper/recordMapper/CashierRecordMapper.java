package az.topaz.backofficeservice.mapper.recordMapper;

import az.topaz.backofficeservice.dto.request.CashierRequest;
import nu.studer.sample.tables.records.CashierRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CashierRecordMapper implements RecordMapper<CashierRequest, CashierRecord> {

    @Override
    public CashierRecord toRecord(CashierRequest request) {
        CashierRecord record = new CashierRecord();
        record.setCashierCode(request.getCashierCode());
        record.setFullName(request.getFullName());
        record.setStatusId(request.getStatusId());
        record.setCityId(request.getCityId());
        record.setOperatorId(request.getOperatorId());
        record.setAddress(request.getAddress());
        record.setMobile(request.getMobile());
        record.setPhone(request.getPhone());
        record.setEmail(request.getEmail());
        record.setCuratorEmail(request.getCuratorEmail());
        record.setCuratorPhone(request.getCuratorPhone());
        record.setZoneId(request.getZoneId());
        record.setRegionId(request.getRegionId());
        record.setOperationStartHour(request.getOperationStartHour());
        record.setOperationEndHour(request.getOperationEndHour());
        record.setCurrentBalance(request.getCurrentBalance());
        record.setPermanentBalance(request.getPermanentBalance());
        record.setNextPermanentBalance(request.getNextPermanentBalance());
        record.setExtraDebitCredit(request.getExtraDebitCredit());
        record.setDebitCredit(request.getDebitCredit());
        record.setCurrentDeptCredit(request.getCurrentDeptCredit());
        record.setMaxPaymentAmount(request.getMaxPaymentAmount());
        record.setMaxVoucherAmount(request.getMaxVoucherAmount());
        record.setMinVoucherAmount(request.getMinVoucherAmount());
        record.setPayoutLimit(request.getPayoutLimit());
        record.setPayoutLimitType(request.getPayoutLimitType());
        record.setVoucherAmount(request.getVoucherAmount());
        record.setUsername(request.getUsername());
        record.setPassword(request.getPassword());
        record.setMacAddress(request.getMacAddress());
        record.setCreatedAt(request.getCreatedAt());
        record.setLastLogin(request.getLastLogin());
        record.setLastLogout(request.getLastLogout());
        record.setMaxBettingStakeAmount(request.getMaxBettingStakeAmount());
        record.setMinBettingStakeAmount(request.getMinBettingStakeAmount());
        record.setTestUser(request.getTestUser());
        record.setFrozen(request.getFrozen());
        record.setType(request.getType());
        record.setCashierProfileStatusId(request.getCashierProfileStatusId());
        record.setIncreaseDebt(request.getIncreaseDebt());
        return record;
    }

    @Override
    public List<CashierRecord> toRecordList(List<CashierRequest> requests) {
        List<CashierRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
