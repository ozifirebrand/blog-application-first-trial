package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import models.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentServices {
    CommentResponsePackage createComment (CommentRequestPackage addRequestPackage);
    void deleteAllComments();
    List<Comment> getAllComments();
    Comment findCommentById(Integer postId);
}
