package az.topaz.agentservice.service;

import az.topaz.agentservice.dto.request.FullRequest;
import az.topaz.agentservice.dto.response.FullResponse;

public interface AgentService {

    FullResponse findById(Long id);

    FullResponse create(FullRequest request);
}
