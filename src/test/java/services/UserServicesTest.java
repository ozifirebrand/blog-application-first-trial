package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServicesTest {
    UserServicesImpl userServices;

    @BeforeEach
    void setUp() {
        userServices = new UserServicesImpl();
    }

    @Test
    public void testThatUserCanInputTextOnBlog(){
        userServices.inputText("Whatever this is");
        assertEquals("Whatever this is", userServices.displayInputText());
    }

    @Test
    public void testThatUserCanDeleteText(){
        userServices.inputText("Whatever this is");
        assertEquals("Whatever this is", userServices.displayInputText());
        userServices.deleteText();
        assertNull(userServices.displayInputText());
    }
}