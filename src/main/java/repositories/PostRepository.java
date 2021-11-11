package repositories;

import models.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    Post findByPostId(Integer id);
    List<Post> findAll();
    void delete(Post post);
    void delete(Integer postId);
}
