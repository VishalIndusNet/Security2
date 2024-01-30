package com.secutityDemo.LearnSecurity.security;

import com.secutityDemo.LearnSecurity.service.LoginUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig  {

    @Bean
    public UserDetailsService userDetailService(){
        return  new LoginUserDetailService();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
