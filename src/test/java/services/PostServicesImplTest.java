package services;

import dtos.requests.PostRequest;
import dtos.response.PostResponse;
import models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.PostRepository;
import repositories.PostRepositoryImpl;


import static org.junit.jupiter.api.Assertions.*;

class PostServicesImplTest {
    PostServices postServices;

    @BeforeEach
    void setUp() {
        postServices = new PostServicesImpl();
    }

    @AfterEach
    void tearDown() {
        postServices.deleteAll();
    }

    public void postServicesTestMethod() {
        PostRequest request = new PostRequest();
        request.setWriterName("Wale adenuga");
        request.setText("thank you");
        postServices.createPost(request);
    }

    @Test
    void createPost() {
        postServicesTestMethod();
        assertEquals(1, postServices.getAllPosts().size());
    }

    @Test
    void getAllPosts() {
        postServicesTestMethod();
        assertEquals(1, postServices.getAllPosts().size());

    }

    @Test
    void deleteAll() {
        postServicesTestMethod();
        postServicesTestMethod();
        postServicesTestMethod();
        assertEquals(3, postServices.getAllPosts().size());
        postServices.deleteAll();
        assertEquals(0, postServices.getAllPosts().size());
    }

//    PostRequest request = new PostRequest();
//        request.setText("Thank you");
//        request.setWriterName("Wale Adenuga");
//    PostResponse postResponse = postServices.createPost(request);
//    Post fromDb = postServices.findPostById(postResponse.getId());
//    assertAll(
//                ()-> assertEquals(postResponse.getWriterName(), fromDb.getWriterName()),
//            ()-> assertEquals(postResponse.getText(), fromDb.getText())
//            );

    @Test
    void findPostById() {
        PostRequest request = new PostRequest();
        request.setPostId(4);
        request.setText("Wahala be like bicycle");
        request.setWriterName("Mosaku safunku");
        PostResponse response = postServices.createPost(request);
        Post savedPost = postServices.findPostById(response.getId());


    }
}