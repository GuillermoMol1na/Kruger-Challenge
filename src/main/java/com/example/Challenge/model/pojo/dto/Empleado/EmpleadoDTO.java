package com.example.Challenge.model.pojo.dto.Empleado;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmpleadoDTO {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;
    private boolean estadoVacunacion;
    private String usuario;
    private String password;

}