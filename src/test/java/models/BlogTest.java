package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogTest {
    Blog blog;
    public void setBlog(){
        blog = new Blog();
    }

    @Test
    public void testThereIsBlog(){
        assertNotNull(blog);
    }

    @Test
    public void testCanInputTextOnBlog(){
        blog.setInputText("Today's blog is whatever!");
        assertEquals("Today's blog is whatever!", blog.getInputText());

    }


}