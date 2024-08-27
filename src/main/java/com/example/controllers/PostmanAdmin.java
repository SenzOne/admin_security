package com.example.controllers;

import com.example.models.Person;
import com.example.services.AdminService;
import com.example.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/api")
public class PostmanAdmin {

    private final AdminService adminService;

    @Autowired
    public PostmanAdmin(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/pass")
    public ResponseEntity<Person> getCurrentUser(Principal principal) {
        return new ResponseEntity<>(adminService.findUserByFirstName(principal.getName()), HttpStatus.OK);
    }

    @GetMapping("/users")
    public List<Person> getAllUsers() {
        return adminService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        return adminService.findOneById(id);
    }

    @PostMapping("/users")
    public ResponseEntity<HttpStatus> addPerson(@RequestBody Person person) {
        adminService.create(person);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PatchMapping("/users/{id}")
    public ResponseEntity<HttpStatus> update(@RequestBody Person updatedPerson) {
        adminService.updateUser(updatedPerson);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id, @RequestBody Person deletedPerson) {
        adminService.removeUser(id);
        return new ResponseEntity<>("User with id " + id + " was deleted", HttpStatus.OK);
    }
}
