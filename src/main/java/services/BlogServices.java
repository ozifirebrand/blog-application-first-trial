package services;

import models.Blog;
import models.User;

public interface BlogServices {
    Blog blog = new Blog();
    User user = new User();

    void inputText(String inputText);

    String displayInputText();

    void deleteInputText();

    void editText(String additionalText);

    void replaceText(String insertedText, String deletedText);

}
