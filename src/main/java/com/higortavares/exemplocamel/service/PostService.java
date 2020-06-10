package com.higortavares.exemplocamel.service;

import com.higortavares.exemplocamel.model.Post;
import com.higortavares.exemplocamel.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public void save(Post post){
        postRepository.save(post);
    }
}
