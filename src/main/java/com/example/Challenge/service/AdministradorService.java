package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;

import java.util.List;

public interface AdministradorService {
    List<Empleado> findAllEmpleados();
}
