package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;

import java.util.List;
import java.util.Optional;
public interface EmpleadoService {
    List<Empleado> findAllEmpleados();
    Optional<Empleado> findByIdEmpleado(int id);
}
