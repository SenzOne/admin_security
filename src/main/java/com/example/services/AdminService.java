//package ru.kata.spring.boot_security.services;
//
//import ru.kata.spring.boot_security.models.Person;
//
//import java.util.List;
//
//public interface AdminService {
//    List<Person> getAllUsers();
//
//    Person findUserByUserName(String firstName);
//
//    Person findOneById(Long id);
//
//    void updateUser(Person person);
//
//    void updateUser(Person person, List<String> roles);
//
//    void removeUser(Long id);
//
//    Person addUser(Person person);
//
//}
package com.example.services;



import com.example.models.Person;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    List<Person> getAllUsers();

    Person findUserByFirstName(String firstName);

    void updateUser(Person person);

    void removeUser(Long id);

    Person findOneById(Long id);

    Person findByEmail(String email);

    void create(Person person);

    Optional<Person> doesPersonExist(String emil);
}