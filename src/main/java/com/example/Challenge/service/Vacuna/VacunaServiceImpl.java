package com.example.Challenge.service.Vacuna;

import com.example.Challenge.model.entity.Empleado.Vacuna;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;
import com.example.Challenge.model.repository.VacunaRepository;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

public class VacunaServiceImpl implements VacunaService {
    private final VacunaRepository vacunaRepository;

    public VacunaServiceImpl(VacunaRepository vacunaRepository) {
        this.vacunaRepository = vacunaRepository;
    }


    @Override
    public Optional<Vacuna> findByIdCedula(int cedula) {
        return vacunaRepository.findByIdCedula(cedula);
    }

    @Override
    public VacunaDTO persist(VacunaDTO dto) {
        Vacuna entity = new Vacuna();
        BeanUtils.copyProperties(dto, entity);
        vacunaRepository.save(entity);
        return null;
    }

    @Override
    public void delete(Vacuna entity) {
        vacunaRepository.delete(entity);
    }
}
