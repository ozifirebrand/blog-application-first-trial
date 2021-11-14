package services;

import dtos.requests.UserInfo;
import dtos.requests.UserRequest;
import dtos.response.UserResponse;
import models.User;

import java.util.List;
import java.util.Map;

public interface UserServices {
    UserResponse createUser (UserRequest userRequest);
    List<User> findAllUsers();
    void deleteUser(UserInfo info);
    User findUserById(Integer userId);
}
