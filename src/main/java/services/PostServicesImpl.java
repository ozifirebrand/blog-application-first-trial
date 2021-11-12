package services;

import dtos.requests.PostRequest;
import dtos.response.PostResponse;
import mappers.ModelMapper;
import models.Post;
import repositories.PostRepository;
import repositories.PostRepositoryImpl;
import java.util.List;

public class PostServicesImpl implements PostServices{

    private static final PostRepository repository = new PostRepositoryImpl();
    @Override
    public PostResponse createPost(PostRequest postRequest) {
        Post post = ModelMapper.map(postRequest);
        Post savedPost = repository.save(post);
        return ModelMapper.map(savedPost);
    }

    @Override
    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public Post findPostById(Integer postId) {
        return repository.findByPostId(postId);
    }
}
