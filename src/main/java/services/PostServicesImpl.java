package services;

import dtos.requests.PostRequest;
import dtos.response.PostResponse;
import models.Post;

import java.util.List;
import java.util.Optional;

public class PostServicesImpl implements PostServices{
    @Override
    public PostResponse createPost(PostRequest postRequest) {
        return null;
    }

    @Override
    public List<Post> getAllPosts() {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Optional<Post> findPostById(Integer postId) {
        return Optional.empty();
    }
}
