package com.rk3.msusermanagement.service;

import java.util.List;

import com.rk3.msusermanagement.model.User;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);

}
