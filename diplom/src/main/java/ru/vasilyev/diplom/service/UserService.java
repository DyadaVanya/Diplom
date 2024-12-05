package ru.vasilyev.diplom.service;

import org.springframework.stereotype.Service;
import ru.vasilyev.diplom.model.User;

@Service
public interface UserService {

    User findByName(String firstName);

    User findById(Long id);

    User save(User user);

    void delete(Long id);
}
