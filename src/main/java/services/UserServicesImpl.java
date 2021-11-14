package services;

import dtos.requests.UserRequest;
import dtos.response.UserResponse;
import models.User;

import java.util.Map;

public class UserServicesImpl implements UserServices{
    @Override
    public UserResponse createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public Map<Integer, User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void findUserById(Integer userId) {

    }
}
