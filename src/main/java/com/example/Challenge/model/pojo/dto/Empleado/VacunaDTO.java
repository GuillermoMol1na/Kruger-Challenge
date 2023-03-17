package com.example.Challenge.model.pojo.dto.Empleado;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VacunaDTO {
    private int idCedula;
    private String idTipoVacuna;
    private String fechaVacunacion;
    private int numeroDosis;
}
