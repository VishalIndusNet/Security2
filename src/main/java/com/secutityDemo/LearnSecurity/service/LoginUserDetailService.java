package com.secutityDemo.LearnSecurity.service;

import com.secutityDemo.LearnSecurity.model.User;
import com.secutityDemo.LearnSecurity.repo.LoginUser;
import com.secutityDemo.LearnSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;


public class LoginUserDetailService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username)  {
        Optional<User>  user = userRepo.findByUsername(username);
        System.out.println(user);
        User u=  user.orElseThrow(()-> new UsernameNotFoundException("User Not Found"));
        return new LoginUser(u);
    }
}
