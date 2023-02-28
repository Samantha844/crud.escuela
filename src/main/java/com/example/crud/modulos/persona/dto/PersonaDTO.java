package com.example.crud.modulos.persona.dto;

import com.example.crud.modelos.Persona;

public class PersonaDTO {

    private Integer idPersona;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String genero;
    private String curp;
    private String direccion;
    private Integer telefono;
    private String correo;

    public PersonaDTO() {
    }

    public PersonaDTO(Persona persona) {
        this.nombre = persona.getNombre();
        this.apellidoPaterno = persona.getApellidoPaterno();
        this.apellidoMaterno = persona.getApellidoMaterno();
        this.genero = persona.getGenero();
        this.curp = persona.getCurp();
        this.direccion = persona.getDireccion();
        this.telefono = persona.getTelefono();
        this.correo = persona.getCorreo();
    }

    public PersonaDTO(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, String curp, String direccion, Integer telefono, String correo) {
        this.nombre = nombre;
        this.apellidoPaterno= apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.genero = genero;
        this.curp = curp;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Integer getIdPersona() {return idPersona;}

    public void setIdPersona(Integer idPersona) {this.idPersona = idPersona;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellidoPaterno() {return apellidoPaterno;}

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
