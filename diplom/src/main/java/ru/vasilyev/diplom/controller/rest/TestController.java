package ru.vasilyev.diplom.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vasilyev.diplom.model.Adventure;
import ru.vasilyev.diplom.model.Role;
import ru.vasilyev.diplom.model.User;
import ru.vasilyev.diplom.repozitori.RoleRepo;
import ru.vasilyev.diplom.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final UserService userService;

    private final RoleRepo roleRepo;
    // Это шляпа, так делать не надо :) Надо создать страницу регистрации и там делать POST запрос
    @GetMapping("/test")
    public void test() {
        roleRepo.save(new Role(1L,"ROLE_USER"));
        roleRepo.save(new Role(2L, "ROLE_ADMIN"));
        User user = new User("Goga","Igor", "Fomin", 21,List.of(new Adventure()));
        userService.save(user);
    }
}
