package com.example.pp_3_1_5_rest.repositories;

import com.example.pp_3_1_5_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findUserById(Long id);
}
