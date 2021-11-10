package repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    CommentRepository commentRepository;
    Comment comment;
    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
        comment = new Comment();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_save() {
        assertEquals(comment,commentRepository.save(comment));
    }

    @Test
    void test_findByPostId() {
        comment.setCommentId(1);
        commentRepository.save(comment);
        assertEquals(comment, commentRepository.findByPostId(comment.getCommentId()));
    }

    @Test
    void findAll() {
        comment.setCommentId(1);
        Comment comment1 = new Comment();
        comment1.setCommentId(2);
        Comment comment2 = new Comment();
        comment2.setCommentId(3);
        Comment comment3 = new Comment();
        comment3.setCommentId(4);
        commentRepository.save(comment);
        commentRepository.save(comment1);
        commentRepository.save(comment2);
        commentRepository.save(comment3);
        assertEquals(4, commentRepository.findAll().size());
    }

    @Test
    void delete() {
        commentRepository.save(comment);
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.delete(comment);
        assertEquals(0, commentRepository.findAll().size());
    }

    @Test
    void testDelete() {
        comment.setCommentId(1);
        commentRepository.save(comment);
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.delete(1);
        assertEquals(0, commentRepository.findAll().size());

    }
}