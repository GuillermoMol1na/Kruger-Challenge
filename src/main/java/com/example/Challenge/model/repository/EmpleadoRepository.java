package com.example.Challenge.model.repository;

import com.example.Challenge.model.entity.Empleado.Empleado;
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
}
