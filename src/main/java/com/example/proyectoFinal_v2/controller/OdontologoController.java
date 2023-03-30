package com.example.proyectoFinal_v2.controller;

import com.example.proyectoFinal_v2.domain.Odontologo;
import com.example.proyectoFinal_v2.service.OdontologoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
private OdontologoService odontologoService;
@Autowired
    public OdontologoController(OdontologoService odontologoService) {
    this.odontologoService = odontologoService;
}
@GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscarOdontologo(@PathVariable Long id) {
    Optional<Odontologo> odontologoBuscado = odontologoService.buscarOdontologo(id);
    if (odontologoBuscado.isPresent()) {
        return ResponseEntity.ok(odontologoBuscado.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}
@GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodosOdontologos(){
        return  ResponseEntity.ok(odontologoService.buscarOdontologos());
}
@PostMapping
    public ResponseEntity<Odontologo> agregarOdontologo(@RequestBody Odontologo odontologo){
    return ResponseEntity.ok(odontologoService.altaOdontologo(odontologo));
}
}
