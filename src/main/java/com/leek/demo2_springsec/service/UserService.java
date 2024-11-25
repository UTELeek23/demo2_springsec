package com.leek.demo2_springsec.service;


import com.leek.demo2_springsec.model.UserInfo;
import com.leek.demo2_springsec.repository.UserInfoRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public record UserService(UserInfoRepository userInfoRepository, PasswordEncoder passwordEncoder) {
    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        if (userInfoRepository.findByUsername(userInfo.getUsername()).isPresent()) {
            return "User already exists";
        }
        if (userInfoRepository.save(userInfo) != null) {
            return "User added successfully";
        }
        return "Error adding user";
    }

}
