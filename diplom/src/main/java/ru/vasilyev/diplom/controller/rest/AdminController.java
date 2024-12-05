package ru.vasilyev.diplom.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin")
    public  String getAdmin() {
        return "admin";
    }
}
