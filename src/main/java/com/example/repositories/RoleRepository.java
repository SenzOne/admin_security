package com.example.repositories;

import com.example.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByNameOfRole(String nameOfRole);

    Optional<Role> findById(Long id);
}
