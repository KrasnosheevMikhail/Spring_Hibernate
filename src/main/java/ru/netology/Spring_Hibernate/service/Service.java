package ru.netology.Spring_Hibernate.service;

import ru.netology.Spring_Hibernate.entity.Person;
import ru.netology.Spring_Hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonRepository repository;

    public Service(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Person> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public void deleteAllPersons(List<Person> personList) {
        repository.deleteAll(personList);
    }

}