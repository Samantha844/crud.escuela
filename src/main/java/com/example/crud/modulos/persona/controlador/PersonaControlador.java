package com.example.crud.modulos.persona.controlador;

import com.example.crud.modulos.persona.dto.PersonaDTO;
import com.example.crud.modulos.persona.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaControlador {

    @Autowired
    private PersonaServicio personaServicio;

    @GetMapping("obtener")
    public ResponseEntity<List<PersonaDTO>> obtenerPersona(){
        List<PersonaDTO> respuesta = personaServicio.obtenerPersona();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("obtener/id")
    public ResponseEntity<PersonaDTO> obtenerPersonas(@RequestParam Integer idPersona){
        PersonaDTO respuesta = personaServicio.obtenerPersonaPorId(idPersona);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarPersona(@RequestBody PersonaDTO parametros){
        Boolean respuesta = personaServicio.guardarPersona(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarPersona(@RequestBody PersonaDTO parametros){
        Boolean respuesta = personaServicio.actualizarPersona(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    @DeleteMapping("eliminar")
    public ResponseEntity<Boolean> eliminarPersona(@RequestParam Integer idPersona){
        Boolean respuesta = personaServicio.eliminarPersona(idPersona);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivarPersona(@RequestBody Integer idPersona){
        Boolean respuesta = personaServicio.activarInactivarPersona(idPersona);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
