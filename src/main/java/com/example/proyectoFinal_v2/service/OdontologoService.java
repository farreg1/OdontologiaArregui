package com.example.proyectoFinal_v2.service;

import com.example.proyectoFinal_v2.domain.Odontologo;
import com.example.proyectoFinal_v2.domain.Paciente;
import com.example.proyectoFinal_v2.exceptions.ResourceNotFoundException;
import com.example.proyectoFinal_v2.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {
    private OdontologoRepository odontologoRepository;
    @Autowired
    public OdontologoService(OdontologoRepository odontologoRepository){
        this.odontologoRepository = odontologoRepository;
    }
    public Optional<Odontologo> buscarOdontologo(Long id){
        return odontologoRepository.findById(id);
    }
    public List<Odontologo> buscarOdontologos(){
        return odontologoRepository.findAll();
    }
    public Odontologo altaOdontologo(Odontologo odontologo){
        return odontologoRepository.save(odontologo);
    }
    public void eliminarOdontologo(Long id) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado = odontologoRepository.findById(id);
        if (odontologoBuscado.isPresent()) {
            odontologoRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Error. No existe el paciente con id= " + id);
        }
    }
    public Odontologo actualizarOdontologo(Odontologo odontologo){
        return odontologoRepository.save(odontologo);

    }
}
