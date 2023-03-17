package com.example.Challenge.controller;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.entity.Empleado.Vacuna;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import com.example.Challenge.model.repository.EmpleadoRepository;
import com.example.Challenge.service.Administrador.AdministradorService;
import com.example.Challenge.service.Vacuna.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/challenge")
public class AdministradorController {
    private final AdministradorService administratorService;
    private final VacunaService vacunaService;

    @Autowired
    public AdministradorController(AdministradorService administradorService, EmpleadoRepository empleadoRepository, VacunaService vacunaService) {
        this.administratorService = administradorService;
        this.vacunaService = vacunaService;
    }

    @GetMapping("/administrador/emp")
    public ResponseEntity<?> findAllEmpleados(){
        List<EmpleadoVO> empleados = administratorService.findAllEmpleados();
        return  new ResponseEntity<>(empleados, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/vacunados")
    public ResponseEntity<?> findAllEmpVaccinated(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpVaccinated();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/novacunados")
    public ResponseEntity<?> findAllEmpNotVaccinated(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpNotVaccinated();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/vacunados/sputnik")
    public ResponseEntity<?> findAllEmpVaccinatedSputnik(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpVaccinatedSputnik();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/vacunados/astra")
    public ResponseEntity<?> findAllEmpVaccinatedAstra(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpVaccinatedAstra();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/vacunados/pfzier")
    public ResponseEntity<?> findAllEmpVaccinatedPfzier(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpVaccinatedPfzier();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/emp/vacunados/jhon")
    public ResponseEntity<?> findAllEmpVaccinatedJhonson(){
        List<EmpleadoVO> empleadosvac = administratorService.findAllEmpVaccinatedJhonson();
        return  new ResponseEntity<>(empleadosvac, HttpStatus.OK);
    }
    @GetMapping("/administrador/{id}")
    public ResponseEntity<?> findbyIdEmpleado(@PathVariable("id") int id){
        Optional<EmpleadoVO> empleado = administratorService.findByIdEmpleadoVO(id);
        if(empleado.isPresent()){
            return  new ResponseEntity<>(empleado.get(), HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @PostMapping("/administrador")
    public ResponseEntity<?> persist(@RequestBody EmpleadoDTO dto) {
        Optional<EmpleadoVO> existentEmpleado = administratorService.findByCedula(dto.getCedula());
        if(!existentEmpleado.isPresent()) {
            return new ResponseEntity<>(administratorService.persist(dto), HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>("El empleado con la cedula: " + dto.getCedula() + " ya existe", HttpStatus.OK);
        }

    }
    @PutMapping("/administrador/{id}")
    public ResponseEntity<?> persist(@PathVariable("id") int id, @RequestBody EmpleadoDTO dto) {
    Optional<Empleado> empleado = administratorService.findByIdEmpleado(id);
        if(empleado.isPresent()){
        empleado.get().setCedula(dto.getCedula());
        empleado.get().setNombres(dto.getNombres());
        empleado.get().setApellidos(dto.getApellidos());
        empleado.get().setCorreo(dto.getCorreo());
        administratorService.update(empleado.get());
        return new ResponseEntity<>("Éxito al actualizar", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("El empleado no existe", HttpStatus.OK);
        }
    }
    @DeleteMapping("/administrador/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") int id){
        Optional<Empleado> empleado = administratorService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            administratorService.delete(empleado.get());
            Optional<Vacuna> vacuna = vacunaService.findByIdCedula(empleado.get().getCedula());
            if(vacuna.isPresent()) {
                vacunaService.delete(vacuna.get());
            }
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
