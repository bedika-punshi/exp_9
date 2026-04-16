package com.Demo_JWT.Demo_JWT.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Demo_JWT.Demo_JWT.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}