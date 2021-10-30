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

    @Override
    public void deleteInputText() {
        User user = blog.getUser();
        user.setInputText(null);
    }

    @Override
    public void editText(String additionalText) {
        User user = blog.getUser();
        user.setInputText(user.getInputText() + additionalText);
    }

    @Override
    public void replaceText(String insertedText, String textToBeDeleted) {
        User user = blog.getUser();
        String [] userInput = user.getInputText().split(" ");
        String newUserInput = "";
        for (String word: userInput){
            if ( word.equals(textToBeDeleted) ){
                word= insertedText;
            }
            newUserInput=newUserInput.concat(word +" ");
        }
        user.setInputText(newUserInput.trim());
    }
}
