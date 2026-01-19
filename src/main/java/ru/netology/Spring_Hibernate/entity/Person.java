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
@Table(name = "persons")
@IdClass(PersonId.class)
@Entity
public class Person {
    @Embedded
    @Id
    private PersonId personId;
    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;
    @Column(name = "city_of_living", nullable = false)
    private String cityOfLiving;


}
