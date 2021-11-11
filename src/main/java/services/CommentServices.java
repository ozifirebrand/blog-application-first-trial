package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import models.Comment;

import java.util.List;

public interface CommentServices {
    CommentResponsePackage createComment (CommentRequestPackage addRequestPackage);
    void deleteComments();
    List<Comment> getAllComments();

    void deleteComment(CommentRequestPackage requestPackage2);
}
