package com.demo2Spring.Security.Login.demo2.service;

import com.demo2Spring.Security.Login.demo2.dto.UserRegistrationDto;
import com.demo2Spring.Security.Login.demo2.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
