package com.useradmin.rest.useradminserver.rest;

import com.useradmin.rest.useradminserver.jpa.Post;
import com.useradmin.rest.useradminserver.jpa.User;
import com.useradmin.rest.useradminserver.repository.PostRepository;
import com.useradmin.rest.useradminserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PostResource {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> retrieveAllUsers(){
        return postRepository.findAll();
    }

    @DeleteMapping("/post/{id}")
    public void deleteStudent(@PathVariable long id) {
        postRepository.deleteById(id);
    }

    @PostMapping("/posts")
    public ResponseEntity<Object> createStudent(@RequestBody Post post) {
        Post savePost = postRepository.save(post);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savePost.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
}
