package com.example.crud.modulos.asignatura.dto;

import com.example.crud.modelos.Alumno;

public class AsignaturaDTO {
    private Integer idAsignatura;
    private String nombre;
    private String descripcion;
    private Alumno alumno;

    public AsignaturaDTO(Integer idAsignatura, String nombre, String descripcion, Alumno alumno) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.alumno = alumno;
    }

    public Integer getIdAsignatura() {return idAsignatura;}

    public void setIdAsignatura(Integer idAsignatura) {this.idAsignatura = idAsignatura;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}
}
