package com.example.Challenge.service.Vacuna;


import com.example.Challenge.model.entity.Vacuna.Vacuna;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;

import java.util.Optional;
public interface VacunaService {

    /**
     * Obtiene la Vacuna de un Empleado mediante su Cédula de identidad
     * @return Vacuna de Empleado específico mediante su <b1>Cedula de identidad</b1>
     */
    Optional<Vacuna> findByIdCedula(int cedula);
    /**
     * Registra a un nuevo Empleado
     * @return Nada, el Empleado Registrado
     */
    VacunaDTO persist(VacunaDTO dto);

    /**
     * Registra a un nuevo Empleado
     * @return Nada, el Empleado Registrado
     */
    void delete(Vacuna entity);
}
