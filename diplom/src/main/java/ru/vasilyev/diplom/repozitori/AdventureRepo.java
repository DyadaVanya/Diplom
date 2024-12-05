package ru.vasilyev.diplom.repozitori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vasilyev.diplom.model.Adventure;
import ru.vasilyev.diplom.model.User;

import java.util.Optional;

@Repository
public interface AdventureRepo extends JpaRepository <Adventure, Long> {
    Optional <Adventure> findByUser (User user);
}
