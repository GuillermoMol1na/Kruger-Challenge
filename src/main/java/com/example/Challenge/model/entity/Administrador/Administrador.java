package com.example.Challenge.model.entity.Administrador;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name="usad")
        private String usad;
        @Column(name="passwor")
        private String passwor;
}
