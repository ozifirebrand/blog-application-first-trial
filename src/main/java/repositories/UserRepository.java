package repositories;

import models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    void deleteUser(User user);
    void editUserProfile(User user);
    User findUserById(String id);
    List<User> findAll();

}
