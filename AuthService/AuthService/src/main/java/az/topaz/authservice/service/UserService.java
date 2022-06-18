package az.topaz.authservice.service;

import az.topaz.authservice.dto.response.UserResponse;

public interface UserService {

    UserResponse findByUsername(String username);
}
