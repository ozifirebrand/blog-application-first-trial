package services;

import dtos.requests.UserInfo;
import dtos.requests.UserRequest;
import dtos.response.UserResponse;
import models.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesImplTest {
    UserServices userServices;
    @BeforeEach
    void setUp() {
        userServices = new UserServicesImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_createUser() {
        UserRequest request = new UserRequest();
        request.setUsername("walesade");
        request.setFirstName("Wale");
        request.setLastName("Adenuga");
        UserResponse response = userServices.createUser(request);
        assertEquals(response.getFirstName(), userServices.findUserById(1).getFirstName());
    }

    @Test
    void test_findAllUsers() {
        UserRequest request = new UserRequest();
        request.setUsername("walesade");
        request.setFirstName("Wale");
        request.setLastName("Adenuga");
        UserResponse response = userServices.createUser(request);
        UserResponse response1 = userServices.createUser(request);
        UserResponse response2 = userServices.createUser(request);
        assertEquals(3, userServices.findAllUsers().size());
    }

    @Test
    void test_deleteUser() {
        UserRequest request = new UserRequest();
        request.setUsername("walesade");
        request.setFirstName("Wale");
        request.setLastName("Adenuga");
        request.setPassword("wale88");
        request.setEmailAddress("dhe@rham.com");
        UserResponse response = userServices.createUser(request);
        assertNotNull(userServices.findUserById(1));
        UserInfo info = new UserInfo();
        info.setPassword("wale88");
        info.setEmailAddress("dhe@rham.com");
        userServices.deleteUser(info);
        assertNull(userServices.findUserById(1));

    }

    @Test
    void test_findUserById() {
        UserRequest request = new UserRequest();
        request.setUsername("walesade");
        request.setFirstName("Wale");
        request.setLastName("Adenuga");
        request.setPassword("wale88");
        request.setEmailAddress("dhe@rham.com");
        UserResponse response = userServices.createUser(request);
        assertNotNull(userServices.findUserById(1));
    }
}