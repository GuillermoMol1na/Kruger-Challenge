package com.example.Challenge.controller;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    @PutMapping("/fill/{id}")
    public ResponseEntity<?> persist(@PathVariable("id") int id, @RequestBody EmpleadoDTO dto) {
        Optional<Empleado> empleado = empleadoService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            empleado.get().setCedula(dto.getCedula());
            empleado.get().setNombres(dto.getNombres());
            empleado.get().setApellidos(dto.getApellidos());
            empleado.get().setCorreo(dto.getCorreo());
            empleadoService.update(empleado.get());
            return new ResponseEntity<>("Éxito al actualizar", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("El empleado no existe", HttpStatus.OK);
        }
    }
}
