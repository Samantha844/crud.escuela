package com.example.crud.modelos;

import com.example.crud.modelos.Alumno;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tutor")
public class Tutor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idTutor;
    @Column
    private String perfil;

    @JoinColumn (name = "idAlumno",referencedColumnName = "idAlumno")
    @ManyToOne (fetch = FetchType.LAZY)
    private Alumno alumno;
    @JoinColumn (name = "idPersona",referencedColumnName = "idPersona")
    @ManyToOne (fetch = FetchType.LAZY)
    private Persona persona;


    public Integer getIdTutor() {return idTutor;}

    public void setIdTutor(Integer idTutor) {this.idTutor = idTutor;}

    public String getPerfil() {return perfil;}

    public void setPerfil(String perfil) {this.perfil = perfil;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}

    public Persona getPersona() {return persona;}

    public void setPersona(Persona persona) {this.persona = persona;}
}
