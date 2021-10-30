package services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogServicesTest {
    BlogServices blogServices;
    @BeforeEach
    public void setBlogServices(){
        blogServices = new BlogServices();
    }

    @Test
    public void testThatBlogCanDisplayInputTextFromUser(){
        blogServices.inputText("Whatever that is");
        assertEquals("Whatever that is", blogServices.displayInputText());
    }

}