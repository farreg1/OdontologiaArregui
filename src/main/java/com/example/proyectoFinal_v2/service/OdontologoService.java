package com.example.proyectoFinal_v2.service;

import com.example.proyectoFinal_v2.domain.Odontologo;
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
    public void borrarOdontologo(Long id){
        odontologoRepository.deleteById(id);
    }
}
