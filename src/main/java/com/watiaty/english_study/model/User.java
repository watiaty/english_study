package com.watiaty.english_study.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ROLE_USER")
public class User extends AbstractUser {
}
