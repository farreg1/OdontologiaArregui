package com.example.proyectoFinal_v2.repository;

import com.example.proyectoFinal_v2.domain.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

}
