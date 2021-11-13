package services;

import dtos.requests.PostRequest;
import dtos.response.PostResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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

    public PostResponse postServicesTestMethod(){
        PostRequest request = new PostRequest();
        request.setWriterName("Wale adenuga");
        request.setText("thank you");
        return postServices.createPost(request);
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

    @Test
    void findPostById() {
        PostRequest request = new PostRequest();
        request.setWriterName("Wale adenuga");
        request.setText("thank you");
        PostResponse response = postServices.createPost(request);

        assertEquals(postServices.createPost(request), postServices.findPostById(1));

    }
}