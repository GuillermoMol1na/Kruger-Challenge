package com.example.Challenge.model.repository;

import com.example.Challenge.model.entity.Empleado.Empleado;
import com.example.Challenge.model.entity.Empleado.Id_tipo_vacuna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Id_tipo_vacunaRepository extends JpaRepository<Id_tipo_vacuna, Integer> {

    @Query("SELECT i FROM Id_tipo_vacuna i WHERE i.id = :id")
    Optional<Id_tipo_vacuna> findById(@Param("id") int id);
}
