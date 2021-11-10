package repositories;

import models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    void deleteUser(User user);
    void deleteUser(Integer userId);
    User findUserById(Integer id);
    List<User> findAll();

}
