package com.example.Challenge.service.Vacuna;

import com.example.Challenge.model.entity.Vacuna.Vacuna;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;
import com.example.Challenge.model.repository.Vacuna.VacunaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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
