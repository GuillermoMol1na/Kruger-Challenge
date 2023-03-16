package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdministradorSErviceImpl implements AdministradorService{
    private final EmpleadoRepository repository;

    @Autowired
    public AdministradorSErviceImpl(EmpleadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Empleado> findAllEmpleados() {
        return repository.findAll();
    }
}
