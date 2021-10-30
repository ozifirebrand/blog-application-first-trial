package services;

import models.User;

public class BlogServicesImpl implements BlogServices{
    @Override
    public void inputText(String inputText) {
        User user = blog.getUser();
        user.setInputText(inputText);
    }

    @Override
    public String displayInputText() {
        User user = blog.getUser();
        return user.getInputText();
    }
}
