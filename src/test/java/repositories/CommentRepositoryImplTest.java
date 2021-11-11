package repositories;

import models.Comment;
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
        commentRepository.deleteAll();
    }

    @Test
    void test_save() {
        assertEquals(comment,commentRepository.save(comment));
    }

    @Test
    void test_findByPostId() {
        commentRepository.save(comment);
        assertEquals(comment, commentRepository.findByCommentId(1));
    }

    @Test
    void findAll() {
        Comment comment1 = new Comment();
        Comment comment2 = new Comment();
        Comment comment3 = new Comment();
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
        commentRepository.save(comment);
        assertEquals(1, commentRepository.findAll().size());
        commentRepository.delete(1);
        assertEquals(0, commentRepository.findAll().size());

    }

    @Test
    public void test_idIncreases_OnCreateComment(){
        commentRepository.save(comment);
        assertEquals(comment, commentRepository.findByCommentId(1));
    }
}