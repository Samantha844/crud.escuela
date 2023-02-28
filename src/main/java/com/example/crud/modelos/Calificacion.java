package com.example.crud.modelos;

import javax.persistence.*;
@Entity
@Table(name = "calificacion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idCalificacion;
    @Column
    private Integer semestre;
    @Column
    private String materia;
    @JoinColumn (name = "idAlumno",referencedColumnName = "idAlumno")
    @ManyToOne(fetch = FetchType.LAZY)
    private Alumno alumno;

    @JoinColumn (name = "idAsignatura",referencedColumnName = "idAsignatura")
    @ManyToOne(fetch = FetchType.LAZY)
    private Asignatura asignatura;


    public Integer getIdCalificacion() {return idCalificacion;}

    public void setIdCalificacion(Integer idCalificacion) {this.idCalificacion = idCalificacion;}

    public Integer getSemestre() {return semestre;}

    public void setSemestre(Integer semestre) {this.semestre = semestre;}

    public String getMateria() {return materia;}

    public void setMateria(String materia) {this.materia = materia;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}

    public Asignatura getAsignatura() {return asignatura;}

    public void setAsignatura(Asignatura asignatura) {this.asignatura = asignatura;}
}

