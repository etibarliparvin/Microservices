package az.topaz.backofficeservice.mapper.businessMapper;

import az.topaz.backofficeservice.dto.response.AgentResponse;
import nu.studer.sample.public_.tables.records.AgentRecord;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AgentResponseMapper implements ResponseMapper<AgentRecord, AgentResponse> {

    @Override
    public AgentResponse toResponse(AgentRecord record) {
        AgentResponse response = new AgentResponse();
        response.setId(record.getId());
        response.setOperatorId(record.getOperatorId());
        response.setAgentCode(record.getAgentCode());
        response.setSerialNumber(record.getSerialNumber());
        response.setFullName(record.getFullName());
        response.setAddress(record.getAddress());
        response.setPhone(record.getPhone());
        response.setMobile(record.getMobile());
        response.setEmail(record.getEmail());
        response.setCityId(record.getCityId());
        response.setStatusId(record.getStatusId());
        response.setVoen(record.getVoen());
        response.setCuratorEmail(record.getCuratorEmail());
        response.setCuratorPhone(record.getCuratorPhone());
        response.setUsername(record.getUsername());
        response.setPassword(record.getPassword());
        response.setCreatedAt(record.getCreatedAt());
        response.setLastLogin(record.getLastLogin());
        response.setType(record.getType());
        response.setTotalCurBalance(record.getTotalCurBalance());
        response.setDebitCredit(record.getDebitCredit());
        response.setExtraDebitCredit(record.getExtraDebitCredit());
        response.setTotalPermanentBalance(record.getTotalPermanentBalance());
        return response;
    }

    @Override
    public List<AgentResponse> toResponseList(List<AgentRecord> records) {
        List<AgentResponse> responses = new ArrayList<>();
        responses.addAll(records.stream().map(this::toResponse).collect(Collectors.toList()));
        return responses;
    }
}
