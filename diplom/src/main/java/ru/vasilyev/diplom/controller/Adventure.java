package ru.vasilyev.diplom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class Adventure {

    @GetMapping("/adventure")
    private String getPage(){return "adventure.html";}}