package com.example.Challenge.model.pojo.vo.Empleado;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmpleadoVO {
    private int id;
    private int cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;
    private String estadoVacunacion;
    private String usuario;
    private String password;
    private String TipoVacuna;
    private String fechaVacunacion;
    private int numeroDosis;

}