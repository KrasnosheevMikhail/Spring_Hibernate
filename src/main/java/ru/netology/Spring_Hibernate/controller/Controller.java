package ru.netology.Spring_Hibernate.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.Spring_Hibernate.entity.Person;
import ru.netology.Spring_Hibernate.service.Service;

import java.util.List;
import java.util.Optional;

@RequestMapping("/persons")
@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return service.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return service.getPersonsByNameAndSurname(name, surname);
    }

    @PostMapping("/save")
    public Person save(Person person) {
        return service.save(person);
    }

    @PostMapping("/delete-all")
    public void deleteAllPersons(List<Person> personList) {
        service.deleteAllPersons(personList);
    }


}
