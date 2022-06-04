package az.topaz.backofficeservice.mapper.businessMapper;

import az.topaz.backofficeservice.dto.response.CashierResponse;
import nu.studer.sample.tables.records.CashierRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CashierResponseMapper implements ResponseMapper<CashierRecord, CashierResponse> {

    @Override
    public CashierResponse toResponse(CashierRecord record) {
        CashierResponse response = new CashierResponse();
        response.setId(record.getId());
        response.setCashierCode(record.getCashierCode());
        response.setFullName(record.getFullName());
        response.setStatusId(record.getStatusId());
        response.setCityId(record.getCityId());
        response.setOperatorId(record.getOperatorId());
        response.setAddress(record.getAddress());
        response.setMobile(record.getMobile());
        response.setPhone(record.getPhone());
        response.setEmail(record.getEmail());
        response.setCuratorEmail(record.getCuratorEmail());
        response.setCuratorPhone(record.getCuratorPhone());
        response.setZoneId(record.getZoneId());
        response.setRegionId(record.getRegionId());
        response.setOperationStartHour(record.getOperationStartHour());
        response.setOperationEndHour(record.getOperationEndHour());
        response.setCurrentBalance(record.getCurrentBalance());
        response.setPermanentBalance(record.getPermanentBalance());
        response.setNextPermanentBalance(record.getNextPermanentBalance());
        response.setExtraDebitCredit(record.getExtraDebitCredit());
        response.setDebitCredit(record.getDebitCredit());
        response.setCurrentDeptCredit(record.getCurrentDeptCredit());
        response.setMaxPaymentAmount(record.getMaxPaymentAmount());
        response.setMaxVoucherAmount(record.getMaxVoucherAmount());
        response.setMinVoucherAmount(record.getMinVoucherAmount());
        response.setPayoutLimit(record.getPayoutLimit());
        response.setPayoutLimitType(record.getPayoutLimitType());
        response.setVoucherAmount(record.getVoucherAmount());
        response.setUsername(record.getUsername());
        response.setPassword(record.getPassword());
        response.setMacAddress(record.getMacAddress());
        response.setCreatedAt(record.getCreatedAt());
        response.setLastLogin(record.getLastLogin());
        response.setLastLogout(record.getLastLogout());
        response.setMaxBettingStakeAmount(record.getMaxBettingStakeAmount());
        response.setMinBettingStakeAmount(record.getMinBettingStakeAmount());
        response.setTestUser(record.getTestUser());
        response.setFrozen(record.getFrozen());
        response.setType(record.getType());
        response.setCashierProfileStatusId(record.getCashierProfileStatusId());
        response.setIncreaseDebt(record.getIncreaseDebt());
        return response;
    }

    @Override
    public List<CashierResponse> toResponseList(List<CashierRecord> records) {
        List<CashierResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
