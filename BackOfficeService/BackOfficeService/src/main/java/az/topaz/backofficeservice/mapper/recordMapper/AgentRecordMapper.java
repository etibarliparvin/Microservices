package az.topaz.backofficeservice.mapper.recordMapper;

import az.topaz.backofficeservice.dto.request.AgentRequest;
import nu.studer.sample.tables.records.AgentRecord;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgentRecordMapper implements RecordMapper<AgentRequest, AgentRecord> {

    @Override
    public AgentRecord toRecord(AgentRequest request) {
        AgentRecord record = new AgentRecord();
        record.setOperatorId(request.getOperatorId());
        record.setAgentCode(request.getAgentCode());
        record.setSerialNumber(request.getSerialNumber());
        record.setFullName(request.getFullName());
        record.setAddress(request.getAddress());
        record.setPhone(request.getPhone());
        record.setMobile(request.getMobile());
        record.setEmail(request.getEmail());
        record.setCityId(request.getCityId());
        record.setStatusId(request.getStatusId());
        record.setVoen(request.getVoen());
        record.setCuratorEmail(request.getCuratorEmail());
        record.setCuratorPhone(request.getCuratorPhone());
        record.setUsername(request.getUsername());
        record.setPassword(request.getPassword());
        record.setCreatedAt(request.getCreatedAt());
        record.setLastLogin(request.getLastLogin());
        record.setType(request.getType());
        record.setTotalCurBalance(request.getTotalCurBalance());
        record.setDebitCredit(request.getDebitCredit());
        record.setExtraDebitCredit(request.getExtraDebitCredit());
        record.setTotalPermanentBalance(request.getTotalPermanentBalance());
        return record;
    }

    public AgentRecord toRecordUpdate(Long id, AgentRequest request) {
        AgentRecord record = new AgentRecord();
        if (!ObjectUtils.isEmpty(id))
            record.setId(id);
        if (!ObjectUtils.isEmpty(request.getOperatorId()))
            record.setOperatorId(request.getOperatorId());
        if (!ObjectUtils.isEmpty(request.getAgentCode()))
            record.setAgentCode(request.getAgentCode());
        if (!ObjectUtils.isEmpty(request.getSerialNumber()))
            record.setSerialNumber(request.getSerialNumber());
        if (!ObjectUtils.isEmpty(request.getFullName()))
            record.setFullName(request.getFullName());
        if (!ObjectUtils.isEmpty(record.getAddress()))
            record.setAddress(request.getAddress());
        if (!ObjectUtils.isEmpty(record.getPhone()))
            record.setPhone(request.getPhone());
        if (!ObjectUtils.isEmpty(request.getMobile()))
            record.setMobile(request.getMobile());
        if (!ObjectUtils.isEmpty(request.getEmail()))
            record.setEmail(request.getEmail());
        if (!ObjectUtils.isEmpty(request.getCityId()))
            record.setCityId(request.getCityId());
        if (!ObjectUtils.isEmpty(request.getStatusId()))
            record.setStatusId(request.getStatusId());
        if (!ObjectUtils.isEmpty(request.getVoen()))
            record.setVoen(request.getVoen());
        if (!ObjectUtils.isEmpty(request.getCuratorEmail()))
            record.setCuratorEmail(request.getCuratorEmail());
        if (!ObjectUtils.isEmpty(request.getCuratorPhone()))
            record.setCuratorPhone(request.getCuratorPhone());
        if (!ObjectUtils.isEmpty(request.getUsername()))
            record.setUsername(request.getUsername());
        if (!ObjectUtils.isEmpty(request.getPassword()))
            record.setPassword(request.getPassword());
        if (!ObjectUtils.isEmpty(request.getCreatedAt()))
            record.setCreatedAt(request.getCreatedAt());
        if (!ObjectUtils.isEmpty(request.getLastLogin()))
            record.setLastLogin(request.getLastLogin());
        if (!ObjectUtils.isEmpty(request.getType()))
            record.setType(request.getType());
        if (!ObjectUtils.isEmpty(request.getTotalCurBalance()))
            record.setTotalCurBalance(request.getTotalCurBalance());
        if (!ObjectUtils.isEmpty(request.getDebitCredit()))
            record.setDebitCredit(request.getDebitCredit());
        if (!ObjectUtils.isEmpty(request.getExtraDebitCredit()))
            record.setExtraDebitCredit(request.getExtraDebitCredit());
        if (!ObjectUtils.isEmpty(request.getTotalPermanentBalance()))
            record.setTotalPermanentBalance(request.getTotalPermanentBalance());
        return record;
    }

    @Override
    public List<AgentRecord> toRecordList(List<AgentRequest> requests) {
        List<AgentRecord> records = new ArrayList<>();
        records.addAll(requests.stream().map(this::toRecord).collect(Collectors.toList()));
        return records;
    }
}
