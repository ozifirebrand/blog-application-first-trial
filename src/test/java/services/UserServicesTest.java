package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesTest {
    UserServices userServices;

    @BeforeEach
    void setUp() {
        userServices = new UserServices();
    }

    @Test
    public void testThatUserCanInputTextOnBlog(){
        userServices.inputText("Whatever this is");
        assertEquals("Whatever this is", userServices.displayInputText());
    }
}