package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import mappers.ModelMapper;
import models.Comment;
import repositories.CommentRepository;
import repositories.CommentRepositoryImpl;
import java.util.List;
import java.util.Optional;


public class CommentServicesImpl implements CommentServices {
    private final CommentRepository commentRepository = new CommentRepositoryImpl();
    @Override
    public CommentResponsePackage createComment(CommentRequestPackage addRequestPackage) {
        Comment comment = ModelMapper.map(addRequestPackage);
        Comment savedComment = commentRepository.save(comment);
        return ModelMapper.map(savedComment);
    }

    @Override
    public void deleteAllComments() {
        commentRepository.deleteAll();
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findCommentById(Integer postId) {
        return null;
    }

}
