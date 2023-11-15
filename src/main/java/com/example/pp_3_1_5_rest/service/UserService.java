package com.example.pp_3_1_5_rest.service;



import com.example.pp_3_1_5_rest.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User findByUsername(String username);

    void save(User user);
    void delete(Long id);
    void update(User user);

    User findUserById(Long id);

}
