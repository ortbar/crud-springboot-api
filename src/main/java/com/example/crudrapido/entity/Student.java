package com.example.crudrapido.entity;

import jakarta.persistence.*;
import lombok.Data; // para evitar tener que poner los getter y setter manualmente lombok


@Data
@Entity // Marca la clase Student como una entidad que se mapea a la tabla tbl_student. Permite que Spring Data JPA o cualquier framework ORM realice automáticamente operaciones de persistencia (como guardar o consultar estudiantes).
@Table(name = "tbl_student")

public class Student {

    @Id // marca id como clave priaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // se genera de forma autom
    private long StudentId;

    private String firstName;

    private String lastName;

    @Column(name = "email_address", unique = true,nullable = false)
    private String email;



}