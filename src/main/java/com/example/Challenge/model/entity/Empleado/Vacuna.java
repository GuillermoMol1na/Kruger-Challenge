package com.example.Challenge.model.entity.Empleado;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="vacuna")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="id_cedula")
    private int idCedula;
    @Column(name="id_tipo_vacuna")
    private String idTipoVacuna;
    @Column(name="fecha_vacunacion")
    private String fechaVacunacion;
    @Column(name="numero_dosis")
    private int numeroDosis;
}
