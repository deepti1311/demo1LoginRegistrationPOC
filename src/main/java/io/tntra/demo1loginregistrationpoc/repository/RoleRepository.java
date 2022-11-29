package io.tntra.demo1loginregistrationpoc.repository;

import io.tntra.demo1loginregistrationpoc.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
