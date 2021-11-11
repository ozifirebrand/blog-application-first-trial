package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import models.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class CommentServicesImpl implements CommentServices {
    @Override
    public CommentResponsePackage createComment(CommentRequestPackage addRequestPackage) {
        Comment comment = new Comment();
        LocalDateTime time = LocalDateTime.now();
        comment.setCommentText(addRequestPackage.getText());
        comment.setTime(time);
        CommentResponsePackage responsePackage = new CommentResponsePackage();
        responsePackage.setText(comment.getCommentText());
        responsePackage.setTime(comment.getTime());
        return responsePackage;
    }

    @Override
    public void deleteComment(CommentRequestPackage addRequestPackage) {

    }

    @Override
    public List<Comment> getAllComments() {
        return null;
    }
}
