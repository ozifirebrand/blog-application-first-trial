package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.CommentRepository;
import repositories.CommentRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class CommentServicesImplTest {
    CommentServices commentServices;
    CommentRepository commentRepository;

    @BeforeEach
    public void setUp() {
        commentServices = new CommentServicesImpl();
        commentRepository = new CommentRepositoryImpl();
    }

    public CommentResponsePackage commentTestHelper() {
        CommentRequestPackage requestPackage = new CommentRequestPackage();
        requestPackage.setText("We are communicating for your good");
        return commentServices.createComment(requestPackage);
    }

    @Test
    public void test_createComment() {
        CommentResponsePackage responsePackage = commentTestHelper();
        assertEquals("We are communicating for your good", responsePackage.getText());
    }

    @Test
    public void test_deleteAllComment() {
        CommentRequestPackage requestPackage = new CommentRequestPackage();
        requestPackage.setText("We are communicating for your good");

        commentTestHelper();
        commentServices.deleteAllComments();
        assertEquals(0, commentRepository.findAll().size());
    }

    @Test
    public void test_getAllComments() {
        CommentResponsePackage commentResponse = commentTestHelper();
        CommentResponsePackage commentResponse2 = commentTestHelper();
        assertEquals("We are communicating for your good", commentResponse.getText());
        assertEquals(2, commentServices.getAllComments().size());
    }

    @Test
    public void test_findCommentById(){
        CommentResponsePackage commentResponse = commentTestHelper();
        CommentResponsePackage commentResponse2 = commentTestHelper();
        assertEquals(commentRepository.findByCommentId(1), commentServices.findCommentById(1));
    }
}