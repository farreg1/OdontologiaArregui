package com.example.proyectoFinal_v2.repository;

import com.example.proyectoFinal_v2.domain.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Long> {
}
