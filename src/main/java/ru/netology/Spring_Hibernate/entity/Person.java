package ru.netology.Spring_Hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "persons")
@Entity
public class Person {
    @Id

    private String name;
    @Id

    private String surname;
    @Id
    private int age;

    private int phone_number;

    private String cityOfLiving;


}
