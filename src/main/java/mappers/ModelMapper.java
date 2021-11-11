package mappers;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import models.Comment;

import java.time.LocalDateTime;

public class ModelMapper {

    public static Comment map(CommentRequestPackage requestPackage){
        Comment comment = new Comment();
        LocalDateTime time = LocalDateTime.now();
        comment.setCommentText(requestPackage.getText());
        comment.setTime(time);
        return comment;
    }

    public static CommentResponsePackage map(Comment comment){
        CommentResponsePackage responsePackage = new CommentResponsePackage();
        responsePackage.setText(comment.getCommentText());
        responsePackage.setTime(comment.getTime());
        return responsePackage;
    }
}