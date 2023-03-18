package com.example.Challenge.model.entity.Id_tipo_Vacuna;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="id_tipo_vacuna")
public class Id_tipo_vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
}
