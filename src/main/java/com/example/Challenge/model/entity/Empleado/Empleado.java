package com.example.Challenge.model.entity.Empleado;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="cedula")
    private String cedula;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Email
    @Column(name="correo")
    private String correo;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private int telefono;
    @Column(name="estado_vacunacion")
    private boolean estadoVacunacion;
    @Column(name="usuario")
    private String usuario;
    @Column(name="password")
    private String password;


   }