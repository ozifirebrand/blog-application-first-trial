package services;

import models.Blog;
import models.User;

public interface BlogServices {
    Blog blog = new Blog();
    User user = new User();

    void inputText(String inputText);

    String displayInputText();
}
