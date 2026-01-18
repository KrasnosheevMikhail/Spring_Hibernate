package ru.netology.Spring_Hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name="persons")
@IdClass(PersonId.class)
@Entity
public class Person {
    @Embedded
    @Id
    private PersonId personId;

    @Column(nullable = false, unique = true)
    private int phone_number;

    @Column(nullable = false)
    private String city_of_living;


}
