package com.watiaty.english_study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "themes_id_seq")
    @SequenceGenerator(allocationSize = 1, name = "themes_id_seq")
    private Long id;

    private String name;

    private Level level;
}
