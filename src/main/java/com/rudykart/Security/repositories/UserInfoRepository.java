package com.rudykart.Security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rudykart.Security.entities.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByName(String username);

}