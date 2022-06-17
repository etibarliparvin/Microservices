package az.topaz.backofficeservice.service.businessService.userBusinessService;

import az.topaz.backofficeservice.dto.common.CommonResponse;
import az.topaz.backofficeservice.dto.request.UserRequest;
import az.topaz.backofficeservice.mapper.businessMapper.UserResponseMapper;
import az.topaz.backofficeservice.service.jooqService.userJooqService.UserJooqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserBusinessServiceImpl implements UserBusinessService {

    private final UserResponseMapper userResponseMapper;
    private final UserJooqService userJooqService;

    @Override
    public CommonResponse create(UserRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(userResponseMapper.toResponse(userJooqService.create(request)));
        return response;
    }

    @Override
    public CommonResponse findById(Long id) {
        CommonResponse response = new CommonResponse();
        response.setItem(userResponseMapper.toResponse(userJooqService.findById(id)));
        return response;
    }

    @Override
    public CommonResponse findAll() {
        CommonResponse response = new CommonResponse();
        response.setItem(userResponseMapper.toResponseList(userJooqService.findAll()));
        return response;
    }

    @Override
    public CommonResponse update(Long id, UserRequest request) {
        CommonResponse response = new CommonResponse();
        response.setItem(userResponseMapper.toResponse(userJooqService.update(id, request)));
        return response;
    }
}
