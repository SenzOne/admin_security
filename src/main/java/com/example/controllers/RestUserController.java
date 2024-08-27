package com.example.controllers;

import com.example.models.Person;
import com.example.services.PeopleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class RestUserController {

    private final PeopleService peopleService;

    public RestUserController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }


    @GetMapping("/showAccount")
    public ResponseEntity<Person> showUserAccount(Principal principal) {
        Optional<Person> person = peopleService.findUserByEmail(principal.getName());
        return person.map(
                value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}