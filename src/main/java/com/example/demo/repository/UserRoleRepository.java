package com.example.demo.repository;

import com.example.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
