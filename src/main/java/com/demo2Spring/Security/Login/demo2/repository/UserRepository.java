package com.demo2Spring.Security.Login.demo2.repository;

import com.demo2Spring.Security.Login.demo2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
