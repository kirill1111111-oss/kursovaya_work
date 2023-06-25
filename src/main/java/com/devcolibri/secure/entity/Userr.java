package com.devcolibri.secure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Userr {
    @Id
    @GeneratedValue
    Integer id;

}
