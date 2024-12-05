package ru.vasilyev.diplom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vasilyev.diplom.service.AdventureService;
import ru.vasilyev.diplom.service.UserService;

@Controller
@RequiredArgsConstructor
public class MyController {
    private final UserService userService;
    private final AdventureService adventureService;

    public MyController(UserService userService, AdventureService adventureService) {
        this.userService = userService;
        this.adventureService = adventureService;
    }

    @GetMapping("/{id}")
    public String getMainpage(Model model) {
        model.addAttribute("name", "Gora");
        return "index.html";
    }

    @GetMapping
    public String test(Model model) {
        model.addAttribute("name", "test");
        return "index.html";
    }
}
