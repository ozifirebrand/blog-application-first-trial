package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentRepositoryImpl implements CommentRepository {
    private final Map<Integer, Comment> commentsDatabase = new HashMap<>();
    @Override
    public Comment save(Comment comment) {
        commentsDatabase.put(comment.getCommentId(), comment);
        return comment;
    }

    @Override
    public Comment findByPostId(Integer commentId) {
        return commentsDatabase.get(commentId);
    }

    @Override
    public List<Comment> findAll() {
        return new ArrayList<>(commentsDatabase.values());
    }

    @Override
    public void delete(Comment comment) {
        commentsDatabase.remove(comment.getCommentId());
    }

    @Override
    public void delete(Integer commentId) {
        commentsDatabase.remove(commentId);
    }
}
