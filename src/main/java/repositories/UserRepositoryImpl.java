package repositories;

import models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> users = new HashMap<>();
    @Override
    public User save(User user) {
        users.put(user.getUserId(), user);
        return user;
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user.getUserId(), user);
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
