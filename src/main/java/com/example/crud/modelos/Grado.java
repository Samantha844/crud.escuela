package com.example.crud.modelos;

import javax.persistence.*;

@Entity
@Table(name = "grado")
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idGrado;
    @Column
    private String Grado;
    @JoinColumn (name = "idGrupo",referencedColumnName = "idGrupo")
    @ManyToOne (fetch = FetchType.LAZY)
    private Grupo grupo;

    @JoinColumn (name = "idAlumno",referencedColumnName = "idAlumno")
    @ManyToOne (fetch = FetchType.LAZY)
    private Alumno alumno;


    public Integer getIdGrado() {return idGrado;}

    public void setIdGrado(Integer idGrado) {this.idGrado = idGrado;}

    public String getGrado() {return Grado;}

    public void setGrado(String grado) {Grado = grado;}

    public Grupo getGrupo() {return grupo;}

    public void setGrupo(Grupo grupo) {this.grupo = grupo;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}
}
