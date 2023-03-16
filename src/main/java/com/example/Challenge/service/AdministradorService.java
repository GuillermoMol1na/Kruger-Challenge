package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.EmpleadoDTO;

import java.util.List;
import java.util.Optional;

public interface AdministradorService {
    List<Empleado> findAllEmpleados();
    Optional<Empleado> findByIdEmpleado(int id);
    void delete(Empleado entity);
    Empleado persist(EmpleadoDTO dto);
}
