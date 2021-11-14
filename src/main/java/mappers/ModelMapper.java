package mappers;

import dtos.requests.CommentRequestPackage;
import dtos.requests.PostRequest;
import dtos.requests.UserInfo;
import dtos.requests.UserRequest;
import dtos.response.CommentResponsePackage;
import dtos.response.PostResponse;
import dtos.response.UserResponse;
import models.Comment;
import models.Post;
import models.User;

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

    public static User map(UserRequest request){
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setUsername(request.getUsername());
        user.setLastName(request.getLastName());
        user.setEmailAddress(request.getEmailAddress());
        user.setPassword(request.getPassword());
        return user;
    }

    public static UserResponse map(User user){
        UserResponse response = new UserResponse();
        response.setLastName(user.getLastName());
        response.setUserId(user.getUserId());
        response.setFirstName(user.getFirstName());
        response.setUsername(user.getUsername());
        return response;
    }

    public static User map(UserInfo info){
        User user = new User() ;
        user.setPassword(info.getPassword());
        user.setEmailAddress(info.getEmailAddress());
        return user;
    }
}