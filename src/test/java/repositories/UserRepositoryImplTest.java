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
    void deleteUser() {
        userRepository.save(user);
        assertEquals(1, userRepository.findAll().size());

        userRepository.deleteUser(user);
        assertEquals(0, userRepository.findAll().size());
    }

    @Test
    void testDeleteUser() {
    }

    @Test
    void findUserById() {
    }

    @Test
    void findAll() {
    }
}