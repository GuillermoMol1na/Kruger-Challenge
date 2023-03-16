package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository repository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Empleado> findAllEmpleados(){
        return repository.findAll();
    }

    @Override
    public Optional<Empleado> findByIdEmpleado(int id) {
        return repository.findById(id);
    }
}
