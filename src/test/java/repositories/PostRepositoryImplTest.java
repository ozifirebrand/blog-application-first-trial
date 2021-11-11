package repositories;

import models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {
    PostRepository postRepository;
    Post post;
    @BeforeEach
    void setUp() {
        postRepository = new PostRepositoryImpl();
        post = new Post();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_save() {
        assertEquals(post, postRepository.save(post));
    }

    @Test
    void findByPostId() {
        post.setPostId(1);
        postRepository.save(post);
        assertEquals(post, postRepository.findByPostId(post.getPostId()));
    }

    @Test
    void findAll() {
        post.setPostId(1);
        Post post1 = new Post();
        post1.setPostId(2);
        Post post2 = new Post();
        post2.setPostId(3);
        Post post3 = new Post();
        post3.setPostId(4);
        postRepository.save(post);
        postRepository.save(post1);
        postRepository.save(post2);
        postRepository.save(post3);
        assertEquals(4, postRepository.findAll().size());
    }

    @Test
    void delete() {
        postRepository.save(post);
        assertEquals(1, postRepository.findAll().size());
        postRepository.delete(post);
        assertEquals(0, postRepository.findAll().size());

    }

    @Test
    void testDelete() {
        post.setPostId(1);
        postRepository.save(post);
        assertEquals(1, postRepository.findAll().size());
        postRepository.delete(1);
        assertEquals(0, postRepository.findAll().size());

    }
}