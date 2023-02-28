package com.example.crud.modelos;

import com.example.crud.modulos.alumno.dto.AlumnoDTO;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idAlumno;
    @Column
    private Integer matricula;
    @JoinColumn (name = "idPersona",referencedColumnName = "idPersona")
    @ManyToOne (fetch = FetchType.LAZY)
    private Persona persona;

    public Alumno() {
    }

    public Alumno(Integer idAlumno, Integer matricula, Persona persona) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.persona = persona;
    }

    public Alumno(AlumnoDTO alumno) {
        this.idAlumno = alumno.getIdAlumno();
        this.matricula = alumno.getMatricula();
    }

    public Integer getIdAlumno() {return idAlumno;}

    public void setIdAlumno(Integer idAlumno) {this.idAlumno = idAlumno;}

    public Integer getMatricula() {return matricula;}

    public void setMatricula(Integer matricula) {this.matricula = matricula;}

    public Persona getPersona() {return persona;}

    public void setPersona(Persona persona) {this.persona = persona;}
}


