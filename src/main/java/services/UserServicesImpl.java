package services;

import lombok.Data;
import models.User;

public class UserServicesImpl implements UserServices {

    private User user = new User();

    @Override
    public void inputText(String inputText) {

    }

    @Override
    public String displayInputText() {
        return null;
    }

    @Override
    public void deleteText() {

    }
}
