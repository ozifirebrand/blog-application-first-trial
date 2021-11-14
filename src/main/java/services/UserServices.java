package services;

import dtos.requests.UserRequest;
import dtos.response.UserResponse;
import models.User;

import java.util.Map;

public interface UserServices {
    UserResponse createUser (UserRequest userRequest);
    Map<Integer, User> findAllUsers();
    void deleteUser(User user);
    void findUserById(Integer userId);
}
