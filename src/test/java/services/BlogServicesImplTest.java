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
    void test_inputText() {
        blogServices.inputText("Whatever this is that");
        assertEquals("Whatever this is that", blogServices.displayInputText());
    }

    @Test
    void test_displayInputText() {
        blogServices.inputText("Whatever this is that");
        assertNotNull(blogServices.displayInputText());
    }

    @Test
    void test_deleteInputText(){
        blogServices.inputText("Whatever this is that");
        assertNotNull(blogServices.displayInputText());
        blogServices.deleteInputText();
        assertNull(blogServices.displayInputText());
    }

    @Test
    void test_editText(){
        blogServices.inputText("Whatever this is that");
        assertNotNull(blogServices.displayInputText());
        blogServices.editText(". It is well");
        assertEquals("Whatever this is that. It is well", blogServices.displayInputText());
    }

    @Test
    void test_insertText(){
        blogServices.inputText("Whatever this is that");
        blogServices.replaceText("that", "this");
        assertEquals("Whatever that is that", blogServices.displayInputText());
    }
}