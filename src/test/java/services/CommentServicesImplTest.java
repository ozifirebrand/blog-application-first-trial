package services;

import dtos.requests.CommentRequestPackage;
import dtos.response.CommentResponsePackage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.CommentRepository;
import repositories.CommentRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

class CommentServicesImplTest {
    CommentServices commentServices;
    CommentRepository commentRepository;
    @BeforeEach
    void setUp() {
        commentServices = new CommentServicesImpl();
        commentRepository = new CommentRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    public CommentResponsePackage commentTestHelper(){
        CommentRequestPackage requestPackage = new CommentRequestPackage();
        requestPackage.setText("We are communicating for your good");
        return commentServices.createComment(requestPackage);
    }
    @Test
    void test_createComment() {
        CommentResponsePackage responsePackage =commentTestHelper();
        assertEquals("We are communicating for your good", responsePackage.getText());
    }

    @Test
    void deleteComment() {
        CommentRequestPackage requestPackage = new CommentRequestPackage();
        requestPackage.setText("We are communicating for your good");

        CommentResponsePackage responsePackage =commentTestHelper();
        commentServices.deleteComments();
    }

    @Test
    void getAllComments() {
    }
}