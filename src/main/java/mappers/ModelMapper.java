package mappers;

import dtos.requests.CommentRequestPackage;
import dtos.requests.PostRequest;
import dtos.response.CommentResponsePackage;
import dtos.response.PostResponse;
import models.Comment;
import models.Post;

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

    public static Post map(PostRequest postRequest){
        Post post = new Post();
        LocalDateTime time = LocalDateTime.now(); post.setLocalDateTime(time);
        post.setText(postRequest.getText());
        return post;
    }

    public static PostResponse map(Post post){
        PostResponse response = new PostResponse();
        response.setText(post.getText());
        response.setLocalDateTime(post.getLocalDateTime());
        return response;
    }
}