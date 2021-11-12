package services;

import dtos.requests.PostRequest;
import dtos.response.PostResponse;
import models.Post;

import java.util.List;
import java.util.Optional;

public interface PostServices {
    PostResponse createPost(PostRequest postRequest);
    List<Post> getAllPosts();
    void deleteAll();
    Post findPostById(Integer postId);
}
