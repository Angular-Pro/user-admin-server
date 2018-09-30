package com.useradmin.rest.useradminserver.rest;

import com.useradmin.rest.useradminserver.jpa.User;
import com.useradmin.rest.useradminserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userRepository.findAll();
    }

    @DeleteMapping("/user/{id}")
    public void deleteStudent(@PathVariable long id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createStudent(@RequestBody User user) {
        User saveUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(saveUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
}
