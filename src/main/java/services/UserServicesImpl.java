package services;

import dtos.requests.UserInfo;
import dtos.requests.UserRequest;
import dtos.response.UserResponse;
import mappers.ModelMapper;
import models.User;
import repositories.UserRepository;
import repositories.UserRepositoryImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServicesImpl implements UserServices{

    private final UserRepository repository = new UserRepositoryImpl();
    private int key = 0;
    @Override
    public UserResponse createUser(UserRequest request) {
        key++;
        User user = ModelMapper.map(request);
        User savedUser = repository.save(user);
        return ModelMapper.map(savedUser);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public void deleteUser(UserInfo info) {
        User user = ModelMapper.map(info);
        for (User savedUser : repository.findAll()){
            if ( savedUser.getPassword().equals(user.getPassword()) && user.getEmailAddress().equals(savedUser.getEmailAddress()) ) {
                repository.deleteUser(savedUser);
            }
        }
    }

    @Override
    public User findUserById(Integer userId) {
        return repository.findUserById(userId);
    }
}
