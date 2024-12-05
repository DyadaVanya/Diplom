package ru.vasilyev.diplom.repozitori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vasilyev.diplom.model.User;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository <User, Long> {
    Optional <User> findByFirstName (String firstName);
}

