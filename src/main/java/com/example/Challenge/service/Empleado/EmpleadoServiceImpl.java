package com.example.Challenge.service.Empleado;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.entity.Empleado.Id_tipo_vacuna;
import com.example.Challenge.model.entity.Empleado.Vacuna;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import com.example.Challenge.model.repository.EmpleadoRepository;
import com.example.Challenge.model.repository.Id_tipo_vacunaRepository;
import com.example.Challenge.model.repository.VacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository repository;
    private final VacunaRepository vacunaRepository;
    private final Id_tipo_vacunaRepository tipo_vacunaRepository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository repository, VacunaRepository vacunaRepository, Id_tipo_vacunaRepository tipo_vacunaRepository){
        this.repository = repository;
        this.vacunaRepository = vacunaRepository;
        this.tipo_vacunaRepository = tipo_vacunaRepository;
    }

    @Override
    public List<Empleado> findAllEmpleados(){
        return repository.findAll();
    }

    @Override
    public Optional<Empleado> findByIdEmpleado(int id) {
        return repository.findById(id);
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
    public void update(Empleado entity) { repository.save(entity);}
}
