package com.example.crud.modelos;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idAsignatura;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @JoinColumn (name = "idAlumno",referencedColumnName = "idAlumno")
    @ManyToOne (fetch = FetchType.LAZY)
    private Alumno alumno;

    @JoinColumn (name = "idAsignatura",referencedColumnName = "idAsignatura")
    @OneToMany
    private Set<Calificacion> calificacion;


    public Integer getIdAsignatura() {return idAsignatura;}

    public void setIdAsignatura(Integer idAsignatura) {this.idAsignatura = idAsignatura;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}

    public Set<Calificacion> getCalificacion() {return calificacion;}

    public void setCalificacion(Set<Calificacion> calificacion) {this.calificacion = calificacion;}
}
