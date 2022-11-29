package io.tntra.demo1loginregistrationpoc.repository;

import io.tntra.demo1loginregistrationpoc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}