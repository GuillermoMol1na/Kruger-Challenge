package com.example.Challenge.service;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import com.example.Challenge.model.repository.EmpleadoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<EmpleadoVO> findAllEmpleados() {
        List<Empleado> listOrigin= repository.findAll();
        List<EmpleadoVO> listResult= new ArrayList<>();
        for (Empleado entity : listOrigin) {
            listResult.add(empleadoToVO(entity));
        }
        return  listResult;
    }

    @Override
    public Optional<Empleado> findByIdEmpleado(int id) {
        return repository.findById(id);
    }

    @Override
    public Optional<EmpleadoVO> findByIdEmpleadoVO(int id) {
        return Optional.of(empleadoToVO(repository.findById(id).get()));
    }

    @Override
    public Optional<EmpleadoVO> findByCedula(int cedula) {
        Optional<Empleado> entity = repository.findByCedula(cedula);
        return entity.map(this::empleadoToVO);
    }

    @Override
    public void delete(Empleado entity) {
        repository.delete(entity);
    }

    @Override
    public EmpleadoVO persist(EmpleadoDTO dto) {
        Empleado entity = new Empleado();
        entity.setCedula(dto.getCedula());
        entity.setNombres(dto.getNombres());
        entity.setApellidos(dto.getApellidos());
        entity.setCorreo(dto.getCorreo());
        repository.save(entity);
        return  null;
    }

    @Override
    public void update(Empleado entity) {
        repository.save(entity);
    }

    private EmpleadoVO empleadoToVO(Empleado e) {
        EmpleadoVO vo = new EmpleadoVO();
        BeanUtils.copyProperties(e, vo);
        return vo;
    }

}
