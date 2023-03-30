package com.example.proyectoFinal_v2.service;

import com.example.proyectoFinal_v2.domain.Paciente;
import com.example.proyectoFinal_v2.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    private PacienteRepository pacienteRepository;
    @Autowired
    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }
    public List<Paciente> buscarTodosPacientes(){
        return pacienteRepository.findAll();
    }
    public Optional<Paciente> buscarXEmail(String email){
        return  pacienteRepository.findByEmail(email);
    }
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public Paciente actualizarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);

    }
    public Optional<Paciente> buscarPaciente(Long id){
        return pacienteRepository.findById(id);
    }
}
