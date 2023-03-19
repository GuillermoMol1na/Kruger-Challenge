package com.example.Challenge.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpResponseMessage {
    FIND_SUCCESSFUL("Busqueda exitosa"),
    PERSIST_SUCCESSFUL("Se registro correctamente"),
    UPDATE_SUCCESSFUL("Se actualizo correctamente"),
    DELETE_SUCCESSFUL("Se elimino correctamente"),

    CHECK_NAMES_OR_LASTNAMES("Revise los Nombres y Apellidos, no se aceptan caracteres epeciales o números"),

    CED_MUST_BE_10("La cédula debe contener 10 dígitos"),

    NOT_FOUND_RECORD("No se encontro el registro"),

    PERSON_RECORD_EXISTENT("El documento del empleado ya se encuentra registrado"),
    NOT_FOUND_USUARIO("No se encontro el registro del usuario: ");
    private final String value;
}
