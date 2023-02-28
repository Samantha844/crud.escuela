package com.example.crud.modulos.alumno.dto;

import com.example.crud.modelos.Alumno;
import com.example.crud.modelos.Persona;
import com.example.crud.modulos.persona.dto.PersonaDTO;


public class AlumnoDTO {

    private Integer idAlumno;
    private Integer matricula;

    private PersonaDTO persona;

    public AlumnoDTO(){
        super();
    }

    public AlumnoDTO(Integer idAlumno, Integer matricula) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
    }

    public AlumnoDTO(Integer idAlumno, Integer matricula, Persona persona) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.persona = new PersonaDTO(persona);
    }

    public AlumnoDTO(Alumno alumno) {
        this.idAlumno = alumno.getIdAlumno();
        this.matricula = alumno.getMatricula();
        this.persona = new PersonaDTO(alumno.getPersona());
    }

    public Integer getIdAlumno() {return idAlumno;}

    public void setIdAlumno(Integer idAlumno) {this.idAlumno = idAlumno;}

    public Integer getMatricula() {return matricula;}

    public void setMatricula(Integer matricula) {this.matricula = matricula;}

    public PersonaDTO getPersona() {return persona;}

    public void setPersona(PersonaDTO persona) {this.persona = persona;}
}
