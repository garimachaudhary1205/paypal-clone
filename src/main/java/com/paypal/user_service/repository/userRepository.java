package com.paypal.user_service.repository;

import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface userRepository {
    User createUser(User user);
    Optional<User> getUser(Long id);
    List<User> getUsers();
}
