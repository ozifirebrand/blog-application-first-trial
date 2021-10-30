package services;

import models.User;

public class UserServices {
    private User user = new User();

    public void inputText(String inputText) {
        user.setInputText(inputText);
    }

    public String displayInputText() {
        return user.getInputText();
    }
}
