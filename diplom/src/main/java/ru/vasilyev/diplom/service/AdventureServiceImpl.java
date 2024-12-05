package ru.vasilyev.diplom.service;

import org.springframework.stereotype.Service;
import ru.vasilyev.diplom.model.Adventure;
import ru.vasilyev.diplom.model.User;
import ru.vasilyev.diplom.repozitori.AdventureRepo;

import java.util.Optional;

@Service
public class AdventureServiceImpl  implements AdventureService{
    private final AdventureRepo adventureRepo;

    public AdventureServiceImpl(AdventureRepo adventureRepo) {
        this.adventureRepo = adventureRepo;
    }

    @Override
    public Adventure save(Adventure adventure) {
        Adventure adventure1 = adventureRepo.save(adventure);
        return adventure1;
    }

    @Override
    public Optional<Adventure> findByUser(User user) {
        return adventureRepo.findByUser(user);
    }
}
