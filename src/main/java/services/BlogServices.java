package services;

import models.Blog;
import models.User;

public interface BlogServices {
        public Blog blog = new Blog();
        public User user = new User();

        public void inputText(String inputText);

        public String displayInputText();
}
