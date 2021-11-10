package repositories;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        return user;
    }

    @Override
    public void deleteUser(User user) {
        
    }

    @Override
    public void editUserProfile(User user) {

    }

    @Override
    public User findUserById(String id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

}
