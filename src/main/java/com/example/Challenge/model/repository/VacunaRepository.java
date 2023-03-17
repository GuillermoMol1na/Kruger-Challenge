package com.example.Challenge.model.repository;


import com.example.Challenge.model.entity.Empleado.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
    @Query("SELECT v FROM Vacuna v WHERE v.id = :id")
    Optional<Vacuna> findById(@Param("id") int id);

    @Query("SELECT v FROM Vacuna v WHERE v.id_cedula = :id_cedula")
    Optional<Vacuna> findByIdCedula(@Param("id_cedula") int id_cedula);
}
