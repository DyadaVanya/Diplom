package ru.vasilyev.diplom.util;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.vasilyev.diplom.repozitori.UserRepo;

//@Component
//@RequiredArgsConstructor
//public class UserDetailsServiceImpl implements UserDetailsService {
//    private final UserRepo userRepo;
//
//    public UserDetailsServiceImpl(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }

//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        var user = userRepo.findByFirstName(username).get();
//        User userDetails = new User(
//                user.getFirstName(),
//                user.getPassword(),
//                user.getRoles()
//                        .stream()
//                        .map(role -> new SimpleGrantedAuthority(role.getName()))
//                        .toList()
//        );
//        return userDetails;
//    }
//}
