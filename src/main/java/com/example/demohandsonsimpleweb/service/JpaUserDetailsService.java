package com.example.demohandsonsimpleweb.service;

import com.example.demohandsonsimpleweb.model.User;
import com.example.demohandsonsimpleweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> s =
                () -> new UsernameNotFoundException("Problem during authentication!");

        User user = userRepository.findByUsername(username).orElseThrow(s);
        return new CustomUserDetails(user);
    }
}
