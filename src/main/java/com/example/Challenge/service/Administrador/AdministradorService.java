package com.example.Challenge.service.Administrador;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;

import java.util.List;
import java.util.Optional;

public interface AdministradorService {
    /**
     * Obtiene la lista de todos los empleados
     * @return listado Empleados
     */
    List<EmpleadoVO> findAllEmpleados();
    /**
     * Obtiene la lista de todos los empleados que se encuentran vacunados
     * @return listado Empleados Vacunados
     */
    List<EmpleadoVO> findAllEmpVaccinated();
    /**
     * Obtiene la lista de todos los empleados que se encuentran sin vacunar
     * @return listado Empleados <b1>NO</b1> Vacunados
     */
    List<EmpleadoVO> findAllEmpNotVaccinated();
    /**
     * Obtiene la lista de todos los empleados vacunados con Sputnik
     * @return listado Empleados Vacunados con <b1>SPUTNIK</b1>
     */
    List<EmpleadoVO> findAllEmpVaccinatedSputnik();
    /**
     * Obtiene la lista de todos los empleados vacunados con AstraZeneca
     * @return listado Empleados Vacunados con <b1>ASTRAZENECA</b1>
     */
    List<EmpleadoVO> findAllEmpVaccinatedAstra();
    /**
     * Obtiene la lista de todos los empleados vacunados con Pfzier
     * @return listado Empleados Vacunados con <b1>PFZIER</b1>
     */
    List<EmpleadoVO> findAllEmpVaccinatedPfzier();
    /**
     * Obtiene la lista de todos los empleados vacunados con Jhonson&Jhonson
     * @return listado Empleados Vacunados con <b1>JHONSON&JHONSON</b1>
     */
    List<EmpleadoVO> findAllEmpVaccinatedJhonson();
    /**
     * Obtiene a un Empleado mediante su id
     * @return Empleado mediante su posición en la lista ID
     */
    Optional<Empleado> findByIdEmpleado(int id);
    /**
     * Obtiene el Value Object de un Empleado mediante su ID
     * @return Empleado Value Object (VO)
     */
    Optional<EmpleadoVO> findByIdEmpleadoVO(int id);
    /**
     * Obtiene al Value Object de un Empleado mediante su Cédula de identidad
     * @return Empleado mediante su <b1>Cedula de identidad</b1>
     */
    Optional<EmpleadoVO> findByCedula(String cedula);
    /**
     * Elimina a un Empleado
     * @return Nada, el Empleado eliminado
     */
    void delete(Empleado entity);
    /**
     * Registra a un nuevo Empleado
     * @return Nada, el Empleado Registrado
     */
    EmpleadoVO persist(EmpleadoDTO dto);
    /**
     * Actualiza a un Empleado
     * @return Nada, el Empleado actualizdo
     */
    void update(Empleado entity);
}
