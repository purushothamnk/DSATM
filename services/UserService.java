package com.DSATM.Hackthon.services;

import java.util.List;
import java.util.Optional;

import com.DSATM.Hackthon.entities.User;

public interface UserService {

    User saveUser(User user);

    Optional<User> getUserById(String id);

    Optional<User> updateUser(User user);

    void deleteUser(String id);

    boolean isUserExist(String userId);

    boolean isUserExistByEmail(String email);

    List<User> getAllUsers();

    // add more methods here related user service[logic]

}