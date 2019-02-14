package com.demo.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
