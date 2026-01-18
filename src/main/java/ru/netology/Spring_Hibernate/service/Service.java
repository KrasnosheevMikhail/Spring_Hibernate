package ru.netology.Spring_Hibernate.service;

import ru.netology.Spring_Hibernate.entity.Person;
import ru.netology.Spring_Hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}