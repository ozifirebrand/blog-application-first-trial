package repositories;

import models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Integer, User> usersDatabase = new HashMap<>();
    private Integer keyValues=0;
    @Override
    public User save(User user) {
        keyValues +=1;
        user.setUserId(keyValues);
        usersDatabase.put(user.getUserId(), user);
        return usersDatabase.get(keyValues);
    }

    @Override
    public void deleteUser(User user) {
        usersDatabase.remove(user.getUserId(), user);
    }

    @Override
    public void deleteUser(Integer userId) {
        usersDatabase.remove(userId);

    }

    @Override
    public User findUserById(Integer id) {

        return usersDatabase.get(id);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(usersDatabase.values());
    }
}
