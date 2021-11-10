package repositories;

import models.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepositoryImpl implements PostRepository{
    private final Map<Integer, Post> postsDatabase = new HashMap<>();
    @Override
    public Post save(Post post) {
        postsDatabase.put(post.getPostId(), post);
        return post;
    }

    @Override
    public Post findByPostId(Integer id) {
        return postsDatabase.get(id);
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(postsDatabase.values());
    }

    @Override
    public void delete(Post post) {
        postsDatabase.remove(post.getPostId());
    }

    @Override
    public void delete(Integer postId) {
        postsDatabase.remove(postId);
    }
}
