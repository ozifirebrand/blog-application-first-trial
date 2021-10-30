package services;

import models.User;

public interface UserServices {
    public User user = new User();

    public void inputText(String inputText);

    public String displayInputText();

    public void deleteText();
}

