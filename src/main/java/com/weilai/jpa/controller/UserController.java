package com.weilai.jpa.controller;

import com.weilai.jpa.pojo.User;
import com.weilai.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public String all() {
        Pageable pageable = PageRequest.of(0, 3);
        User user = userRepository.findOneById(1);
        System.out.println(user);
        return user.toString();
    }

}
