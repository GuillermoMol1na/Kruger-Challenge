package com.example.Challenge.service.Vacuna;


import com.example.Challenge.model.entity.Empleado.Vacuna;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;

import java.util.Optional;
public interface VacunaService {

    Optional<Vacuna> findByIdCedula(int cedula);
    VacunaDTO persist(VacunaDTO dto);
    void delete(Vacuna entity);
}
