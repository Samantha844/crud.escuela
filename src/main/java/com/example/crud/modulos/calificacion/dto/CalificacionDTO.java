package com.example.crud.modulos.calificacion.dto;

import com.example.crud.modelos.Alumno;
import com.example.crud.modelos.Asignatura;

import java.util.Set;

public class CalificacionDTO {
    private Integer idCalificacion;
    private Integer semestre;
    private String materia;
    private Alumno alumno;
    private Asignatura asignatura;

    public CalificacionDTO(Integer idCalificacion, Integer semestre, String materia, Alumno alumno, Asignatura asignatura) {
        this.idCalificacion = idCalificacion;
        this.semestre = semestre;
        this.materia = materia;
        this.alumno = alumno;
        this.asignatura = asignatura;
    }

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
