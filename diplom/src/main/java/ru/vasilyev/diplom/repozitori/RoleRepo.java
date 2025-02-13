package ru.vasilyev.diplom.repozitori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vasilyev.diplom.model.Role;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository <Role, Long> {
    Optional <Role> findByName (String Name);
}
