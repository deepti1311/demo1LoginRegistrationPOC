package io.tntra.demo1loginregistrationpoc.service;


import io.tntra.demo1loginregistrationpoc.dto.UserDto;
import io.tntra.demo1loginregistrationpoc.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}