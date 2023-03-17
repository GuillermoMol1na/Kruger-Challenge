package com.example.Challenge.model.pojo.dto.Administrador;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministradorDTO {
    private String user;
    private String password;
}
