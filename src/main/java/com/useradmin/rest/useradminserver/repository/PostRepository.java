package com.useradmin.rest.useradminserver.repository;

import com.useradmin.rest.useradminserver.jpa.Post;
import com.useradmin.rest.useradminserver.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
