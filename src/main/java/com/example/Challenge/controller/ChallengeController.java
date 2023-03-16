package com.example.Challenge.controller;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.service.AdministradorService;
import com.example.Challenge.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/challenge")
public class ChallengeController {
    private final AdministradorService administratorService;

    @Autowired
    public ChallengeController(AdministradorService administradorService) {
        this.administratorService = administradorService;
    }

    @GetMapping("/algo")
    public ResponseEntity<?> algo(){
        return  new ResponseEntity<>("algo", HttpStatus.OK);
    }

    @GetMapping("/empleados")
    public ResponseEntity<?> findAllEmpleados(){
        List<Empleado> empleados = administratorService.findAllEmpleados();
        return  new ResponseEntity<>(empleados, HttpStatus.OK);
    }
    @GetMapping("/administrador/{id}")
    public ResponseEntity<?> findbyIdEmpleado(@PathVariable("id") int id){
        Optional<Empleado> empleado = administratorService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            return  new ResponseEntity<>(empleado.get(), HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @DeleteMapping("/administrador/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") int id){
        Optional<Empleado> empleado = administratorService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            administratorService.delete(empleado.get());
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
