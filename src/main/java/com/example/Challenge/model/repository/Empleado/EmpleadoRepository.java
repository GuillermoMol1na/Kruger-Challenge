package com.example.Challenge.model.repository.Empleado;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.pojo.vo.Empleado.EmpleadoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    @Query("SELECT e FROM Empleado e")
    List<Empleado> findAllEmpleados();

    @Query("SELECT e FROM Empleado e WHERE e.cedula = :cedula")
    Optional<Empleado> findByCedula(@Param("cedula") int cedula);

    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento,\n" +
            "E.direccion, E.telefono, E.estado_vacunacion, I.\"name\", V.fecha_vacunacion, V.numero_dosis\n" +
            "FROM empleado E, vacuna V, id_tipo_vacuna I\n" +
            "WHERE E.estado_vacunacion=true AND E.cedula = V.id_cedula AND V.id_tipo_vacuna = I.id", nativeQuery = true)
    List findAllEmpVaccinated();
    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento, \n" +
            "            E.direccion, E.telefono, E.estado_vacunacion\n" +
            "            FROM empleado E\n" +
            "            WHERE E.estado_vacunacion=false", nativeQuery = true)
    List findAllEmpNotVaccinated();
    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento, \n" +
            "            E.direccion, E.telefono, E.estado_vacunacion, I.\"name\", V.fecha_vacunacion, V.numero_dosis\n" +
            "            FROM empleado E, vacuna V, id_tipo_vacuna I\n" +
            "            WHERE E.estado_vacunacion=true AND E.cedula = V.id_cedula AND V.id_tipo_vacuna = I.id AND I.id=1", nativeQuery = true)
    List findAllEmpVaccinatedSputnik();
    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento, \n" +
            "            E.direccion, E.telefono, E.estado_vacunacion, I.\"name\", V.fecha_vacunacion, V.numero_dosis\n" +
            "            FROM empleado E, vacuna V, id_tipo_vacuna I\n" +
            "            WHERE E.estado_vacunacion=true AND E.cedula = V.id_cedula AND V.id_tipo_vacuna = I.id AND I.id=2", nativeQuery = true)
    List findAllEmpVaccinatedAstra();
    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento, \n" +
            "            E.direccion, E.telefono, E.estado_vacunacion, I.\"name\", V.fecha_vacunacion, V.numero_dosis\n" +
            "            FROM empleado E, vacuna V, id_tipo_vacuna I\n" +
            "            WHERE E.estado_vacunacion=true AND E.cedula = V.id_cedula AND V.id_tipo_vacuna = I.id AND I.id=3", nativeQuery = true)
    List findAllEmpVaccinatedPfzier();
    @Query(value = "SELECT E.id, E.cedula, E.nombres, E.apellidos,E.correo,E.fecha_nacimiento, \n" +
            "            E.direccion, E.telefono, E.estado_vacunacion, I.\"name\", V.fecha_vacunacion, V.numero_dosis\n" +
            "            FROM empleado E, vacuna V, id_tipo_vacuna I\n" +
            "            WHERE E.estado_vacunacion=true AND E.cedula = V.id_cedula AND V.id_tipo_vacuna = I.id AND I.id=4", nativeQuery = true)
    List findAllEmpVaccinatedJhonson();
}
