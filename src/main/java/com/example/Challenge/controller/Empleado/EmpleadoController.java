package com.example.Challenge.controller.Empleado;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.entity.Vacuna.Vacuna;
import com.example.Challenge.model.pojo.dto.Vacuna.VacunaDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import com.example.Challenge.service.Empleado.EmpleadoService;
import com.example.Challenge.service.Id_tipo_vacuna.Ip_tipo_vacunaService;
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
    private final Ip_tipo_vacunaService tipoVacunaService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService, VacunaService vacunaService, Ip_tipo_vacunaService tipoVacunaService) {
        this.empleadoService = empleadoService;
        this.vacunaService = vacunaService;
        this.tipoVacunaService = tipoVacunaService;
    }
    @PatchMapping("/fill/{id}")
    public ResponseEntity<?> persist(@PathVariable("id") int id, @RequestBody EmpleadoVO vo) {
        Optional<Empleado> empleado = empleadoService.findByIdEmpleado(id);
        if(empleado.isPresent()){
            empleado.get().setFechaNacimiento(vo.getFechaNacimiento());
            empleado.get().setDireccion(vo.getDireccion());
            empleado.get().setTelefono(vo.getTelefono());
            empleado.get().setEstadoVacunacion(vo.isEstadoVacunacion());
            empleadoService.update(empleado.get());
            if(vo.isEstadoVacunacion()){
                VacunaDTO dto = new VacunaDTO();
                dto.setFechaVacunacion(vo.getFechaVacunacion());
                dto.setIdCedula(vo.getCedula());
                dto.setIdTipoVacuna(tipoVacunaService.getIdTipoVac(vo.getTipoVacuna()));
                dto.setNumeroDosis(vo.getNumeroDosis());
                vacunaService.persist(dto);
            }
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
