package com.useradmin.rest.useradminserver.repository;

import com.useradmin.rest.useradminserver.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String userName);

    Optional<User> findByEmail(String email);

    Optional<User> findByUserNameOrEmail(String userName, String email);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

    List<User> findByIdIn(List<Long> userIds);
}
