package ru.vasilyev.diplom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.vasilyev.diplom.model.User;
import ru.vasilyev.diplom.repozitori.RoleRepo;
import ru.vasilyev.diplom.repozitori.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User findByName(String firstName) {
        Optional<User> user = userRepo.findByFirstName(firstName);
        User user1 = user.get();
        return user1;
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepo.findById(id);
        User user1 = user.get();
        return user1;
    }

    @Override
    public User save(User user) {
        user.getAdventures().forEach((el) -> el.setUser(user));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(List.of(roleRepo.findByName("ROLE_USER").get(), roleRepo.findByName("ROLE_ADMIN").get()));
        User newUser = userRepo.save(user);
        return newUser;
    }

    @Override
    public void delete(Long id) {
        userRepo.delete(userRepo.findById(id).get());
    }
}
