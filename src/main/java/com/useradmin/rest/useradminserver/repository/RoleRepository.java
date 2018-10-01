package com.useradmin.rest.useradminserver.repository;

import com.useradmin.rest.useradminserver.jpa.Role;
import com.useradmin.rest.useradminserver.jpa.RoleName;
import com.useradmin.rest.useradminserver.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
