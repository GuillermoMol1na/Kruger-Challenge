package com.example.Challenge.model.pojo.dto.Vacuna;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VacunaDTO {
    private String idCedula;
    private int idTipoVacuna;
    private Date fechaVacunacion;
    private int numeroDosis;
}
