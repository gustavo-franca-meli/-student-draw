package com.mercadolivre.studentDraw.infra.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public StudentEntity() {
    }

    public StudentEntity(String name) {
        this.name = name;
    }
}
