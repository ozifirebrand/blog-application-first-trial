package mappers;

import dtos.requests.CommentRequestPackage;
import dtos.requests.PostRequest;
import dtos.response.CommentResponsePackage;
import dtos.response.PostResponse;
import models.Comment;
import models.Post;

import java.time.LocalDateTime;
import java.util.UUID;

public class ModelMapper {
    private static int counter = 0;
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
        post.setWriterName(postRequest.getWriterName());
        post.setText(postRequest.getText());
        post.setPostId(counter+1);
        counter++;
        return post;
    }

    public static PostResponse map(Post post){
        PostResponse response = new PostResponse();
        response.setText(post.getText());
        response.setLocalDateTime(post.getLocalDateTime());
        response.setId(post.getPostId());
        response.setWriterName(post.getWriterName());
        return response;
    }
}