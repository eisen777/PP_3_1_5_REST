package com.example.pp_3_1_5_rest.repositories;

import com.example.pp_3_1_5_rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
