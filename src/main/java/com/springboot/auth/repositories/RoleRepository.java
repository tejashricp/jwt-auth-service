package com.springboot.auth.repositories;

import com.springboot.auth.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName( String name);
}
