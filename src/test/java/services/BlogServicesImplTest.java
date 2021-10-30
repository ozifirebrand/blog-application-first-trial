package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogServicesImplTest {
    BlogServices blogServices;

    @BeforeEach
    void setUp() {
        blogServices = new BlogServicesImpl();
    }

    @Test
    void inputText() {
        blogServices.inputText("Whatever this is that");
        assertEquals("Whatever this is that", blogServices.displayInputText());
    }

    @Test
    void displayInputText() {
    }
}