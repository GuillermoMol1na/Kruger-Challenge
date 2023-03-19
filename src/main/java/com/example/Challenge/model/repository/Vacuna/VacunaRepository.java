package com.example.Challenge.model.repository.Vacuna;


import com.example.Challenge.model.entity.Vacuna.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
    @Query("SELECT v FROM Vacuna v WHERE v.id = :id")
    Optional<Vacuna> findById(@Param("id") int id);

    @Query(value = "SELECT v FROM Vacuna v WHERE v.id_cedula = :id_cedula",nativeQuery = true)
    Optional<Vacuna> findByIdCedula(@Param("id_cedula") String id_cedula);
}
