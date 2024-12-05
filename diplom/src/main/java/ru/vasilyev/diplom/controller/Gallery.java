package ru.vasilyev.diplom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Gallery {

    @GetMapping("/gallery")
    private String getPage(){return "gallery.html";}}