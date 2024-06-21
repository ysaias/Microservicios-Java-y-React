package com.example.React_Ionic_Microservicio.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "proveedores")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String telefono;

    private String direccion;

    private String web;

    private String contacto;

}
