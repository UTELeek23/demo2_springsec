package com.leek.demo2_springsec.repository;

import com.leek.demo2_springsec.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional findByUsername(String username);
}
