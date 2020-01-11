package com.HAndN.spring_hibernate.services;

import com.HAndN.spring_hibernate.models.CustomUserDetails;
import com.HAndN.spring_hibernate.models.User;
import com.HAndN.spring_hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.getByUserName(userName);
        user.orElseThrow(() ->new UsernameNotFoundException("Wrong User Name"));

        return user.map(CustomUserDetails::new).get();
    }
}
