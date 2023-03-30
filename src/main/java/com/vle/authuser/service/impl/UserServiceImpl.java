package com.vle.authuser.service.impl;

import com.vle.authuser.repository.UserRepository;
import com.vle.authuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
