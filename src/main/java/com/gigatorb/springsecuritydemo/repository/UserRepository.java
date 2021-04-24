package com.gigatorb.springsecuritydemo.repository;

import com.gigatorb.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
