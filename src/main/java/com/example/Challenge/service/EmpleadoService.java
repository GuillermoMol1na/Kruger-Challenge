package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;

import java.util.List;
import java.util.Optional;
public interface EmpleadoService {
    List<Empleado> findAllEmpleados();
    Optional<Empleado> findByIdEmpleado(int id);
    EmpleadoVO persist(EmpleadoDTO dto);
    void update(Empleado entity);
}
