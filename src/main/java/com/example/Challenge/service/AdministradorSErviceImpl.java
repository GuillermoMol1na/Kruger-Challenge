package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.EmpleadoDTO;
import com.example.Challenge.model.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    @Override
    public Optional<Empleado> findByIdEmpleado(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Empleado entity) {
        repository.delete(entity);
    }

    @Override
    public Empleado persist(EmpleadoDTO dto) {
        Empleado entity = new Empleado();
        entity.setCedula(dto.getCedula());
        entity.setNombres(dto.getNombres());
        entity.setApellidos(dto.getApellidos());
        entity.setCorreo(dto.getCorreo());
        repository.save(entity);
        return  null;
    }
}
