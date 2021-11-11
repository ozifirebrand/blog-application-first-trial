package services;

import dtos.requests.PostRequest;
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
    }

    @Test
    void createPost() {
        PostRequest request = new PostRequest();

        postServices.createPost(request);
    }

    @Test
    void getAllPosts() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void findPostById() {
    }
}