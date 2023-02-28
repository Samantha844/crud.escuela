package com.example.crud.modulos.persona.servicio;

import com.example.crud.modelos.Alumno;
import com.example.crud.modelos.Persona;
import com.example.crud.modulos.persona.dto.PersonaDTO;
import com.example.crud.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServicio {
    @Autowired
    private PersonaRepositorio personaRepositorio;

    public List<PersonaDTO> obtenerPersona(){

        List<Persona> lista = personaRepositorio.findAll();
        return  lista.stream().map(PersonaDTO::new).collect(Collectors.toList());
    }

    public PersonaDTO obtenerPersonaPorId(Integer idPersona){
        Optional<Persona> persona = personaRepositorio.findById(idPersona);

        if (persona.isPresent()){
            return new PersonaDTO(
                    persona.get().getNombre(),
                    persona.get().getApellidoPaterno(),
                    persona.get().getApellidoMaterno(),
                    persona.get().getGenero(),
                    persona.get().getCurp(),
                    persona.get().getDireccion(),
                    persona.get().getTelefono(),
                    persona.get().getCorreo()
            );
        }

        return null;
    }

    public Boolean guardarPersona(PersonaDTO parametros) {

        Persona persona = new Persona();

        if (parametros.getIdPersona() != null){
            persona = personaRepositorio.getOne(parametros.getIdPersona());
        }

        persona.setNombre(parametros.getNombre());
        persona.setApellidoPaterno(parametros.getApellidoPaterno());
        persona.setApellidoMaterno(parametros.getApellidoMaterno());
        persona.setGenero(parametros.getGenero());
        persona.setCurp(parametros.getCurp());
        persona.setDireccion(parametros.getDireccion());
        persona.setTelefono(parametros.getTelefono());
        persona.setCorreo(parametros.getCorreo());

        personaRepositorio.save(persona);
        return true;
    }

    public Boolean actualizarPersona(PersonaDTO parametros) {

        Persona persona = personaRepositorio.getOne(parametros.getIdPersona());
        persona.setNombre(parametros.getNombre());
        persona.setApellidoPaterno(parametros.getApellidoPaterno());
        persona.setApellidoMaterno(parametros.getApellidoMaterno());
        persona.setGenero(parametros.getGenero());
        persona.setCurp(parametros.getCurp());
        persona.setDireccion(parametros.getDireccion());
        persona.setTelefono(parametros.getTelefono());
        persona.setCorreo(parametros.getCorreo());

        personaRepositorio.save(persona);
        return true;
    }

    public Boolean eliminarPersona(Integer idPersona) {
        Persona persona = personaRepositorio.getOne(idPersona);

        personaRepositorio.delete(persona);
        return true;
    }

    public Boolean activarInactivarPersona(Integer idPersona) {
        Persona persona = personaRepositorio.getOne(idPersona);
        personaRepositorio.save(persona);
        return true;
    }

}
