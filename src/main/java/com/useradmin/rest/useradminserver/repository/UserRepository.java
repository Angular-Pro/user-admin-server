package com.useradmin.rest.useradminserver.repository;

import com.useradmin.rest.useradminserver.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
