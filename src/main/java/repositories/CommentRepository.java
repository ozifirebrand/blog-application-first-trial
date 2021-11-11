package repositories;

import models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findByPostId(Integer commentId);
    List<Comment> findAll();
    void delete(Comment comment);
    void delete(Integer commentId);

    void deleteAll();
}
