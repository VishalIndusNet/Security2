package com.secutityDemo.LearnSecurity.repo;

import com.secutityDemo.LearnSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String name);

}
