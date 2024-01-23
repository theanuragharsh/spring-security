package com.security.springsecurity.controller.user;

import com.security.springsecurity.dao.UserRepo;
import com.security.springsecurity.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserRepo userRepo;

    @GetMapping("/getAllUsers")
    public List<User> getUser() {
        return userRepo.findAll();

    }
}
