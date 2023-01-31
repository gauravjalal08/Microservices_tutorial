package com.gauravjalal.UserService.repository;

import com.gauravjalal.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
