package services;

import models.Blog;
import models.User;

public class BlogServices {
    private Blog blog = new Blog();

    public void inputText(String inputText) {
        User user = blog.getUser();
        user.setInputText(inputText);
    }

    public String displayInputText() {
        User user = blog.getUser();
        return user.getInputText();
    }
}
