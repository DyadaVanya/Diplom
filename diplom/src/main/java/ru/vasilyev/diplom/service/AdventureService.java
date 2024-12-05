package ru.vasilyev.diplom.service;

import org.springframework.stereotype.Service;
import ru.vasilyev.diplom.model.Adventure;
import ru.vasilyev.diplom.model.User;

import java.util.Optional;

@Service
public interface AdventureService {
    Adventure save(Adventure adventure);

    Optional<Adventure> findByUser(User user);
}
