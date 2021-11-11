package repositories;

import models.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    UserRepository userRepository;
    User user ;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepositoryImpl();
        user = new User();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_save() {
        assertEquals(user, userRepository.save(user));
        assertEquals(1, userRepository.findAll().size());

    }

    @Test
    void test_deleteUser() {
        userRepository.save(user);
        assertEquals(1, userRepository.findAll().size());

        userRepository.deleteUser(user);
        assertEquals(0, userRepository.findAll().size());
    }

    @Test
    void test_deleteUserById() {
        userRepository.save(user);
        assertEquals(1, userRepository.findAll().size());

        userRepository.deleteUser(1);
        assertEquals(0, userRepository.findAll().size());

    }

    @Test
    void findUserById() {
        userRepository.save(user);
        assertEquals(1, userRepository.findAll().size());
        assertEquals(user, userRepository.findUserById(1));

    }

    @Test
    void findAll() {
        user.setUserId(6);
        userRepository.save(user);
        User user2 = new User();
        user2.setUserId(1);
        userRepository.save(user2);

        User user3 = new User();
        user3.setUserId(2);
        userRepository.save(user3);

        User user4 = new User();
        user4.setUserId(3);
        userRepository.save(user4);

        assertEquals(4, userRepository.findAll().size());
    }
}