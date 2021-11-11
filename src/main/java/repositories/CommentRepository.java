package repositories;

import models.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findByCommentId(Integer commentId);
    List<Comment> findAll();
    void delete(Comment comment);
    void delete(Integer commentId);

    void deleteAll();
}
