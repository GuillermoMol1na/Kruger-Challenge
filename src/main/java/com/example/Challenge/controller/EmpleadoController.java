package com.example.Challenge.controller;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.entity.Empleado.Vacuna;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;
import com.example.Challenge.service.Empleado.EmpleadoService;
import com.example.Challenge.service.Vacuna.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    private final EmpleadoService empleadoService;
    private final VacunaService vacunaService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService, VacunaService vacunaService) {
        this.empleadoService = empleadoService;
        this.vacunaService = vacunaService;
    }
    @PatchMapping("/fill/{id}")
    public ResponseEntity<?> persist(@PathVariable("id") int id, @RequestBody EmpleadoDTO dto) {
        Optional<Empleado> empleado = empleadoService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            empleado.get().setFechaNacimiento(dto.getFechaNacimiento());
            empleado.get().setDireccion(dto.getDireccion());
            empleado.get().setTelefono(dto.getTelefono());
            empleado.get().setEstadoVacunacion(dto.isEstadoVacunacion());
            empleadoService.update(empleado.get());
            return new ResponseEntity<>("Éxito al completar los campos", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Cuenta inexistente", HttpStatus.OK);
        }
    }
    @PostMapping("/fill/vac")
    public ResponseEntity<?> persistVaccinated(@RequestBody VacunaDTO dto) {
        Optional<Vacuna> vacuna = vacunaService.findByIdCedula(dto.getIdCedula());
        if(!vacuna.isPresent()){
            return new ResponseEntity<>(vacunaService.persist(dto), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("El registro relacionado a la vacuna del empleado ya existe", HttpStatus.OK);
        }
    }
}
