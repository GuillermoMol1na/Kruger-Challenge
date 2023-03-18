package com.example.Challenge.service.Empleado;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.dto.Empleado.EmpleadoDTO;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;

import java.util.List;
import java.util.Optional;
public interface EmpleadoService {
    /**
     * Obtiene la lista de todos los empleados
     * @return listado Empleados
     */
    List<Empleado> findAllEmpleados();
    /**
     * Obtiene a un Empleado mediante su id
     * @return Empleado mediante su posición en la lista ID
     */
    Optional<Empleado> findByIdEmpleado(int id);
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
