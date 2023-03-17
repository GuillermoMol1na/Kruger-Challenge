package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;

import java.util.List;
import java.util.Optional;

public interface AdministradorService {
    List<EmpleadoVO> findAllEmpleados();
    Optional<Empleado> findByIdEmpleado(int id);
    Optional<EmpleadoVO> findByIdEmpleadoVO(int id);
    Optional<EmpleadoVO> findByCedula(int cedula);
    void delete(Empleado entity);
    EmpleadoVO persist(EmpleadoDTO dto);
    void update(Empleado entity);
}
