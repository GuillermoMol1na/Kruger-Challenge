package com.example.Challenge.controller;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/challenge")
public class ChallengeController {
    private final EmpleadoService empleadoService;

    @Autowired
    public ChallengeController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/algo")
    public ResponseEntity<?> algo(){
        return  new ResponseEntity<>("algo", HttpStatus.OK);
    }

    @GetMapping("/empleados")
    public ResponseEntity<?> findAllEmpleados(){
        List<Empleado> empleados = empleadoService.findAllEmpleados();
        return  new ResponseEntity<>(empleados, HttpStatus.OK);
    }
    @GetMapping("/empleados/{id")
    public ResponseEntity<?> findbyIdEmpleado(@PathVariable("id") int id){
        Optional<Empleado> empleado = empleadoService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            return  new ResponseEntity<>(empleado.get(), HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
