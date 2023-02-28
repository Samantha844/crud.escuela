package com.example.crud.modelos;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idGrupo;
    @Column
    private String nombre;
    @JoinColumn (name = "idDocente",referencedColumnName = "idDocente")
    @ManyToOne (fetch = FetchType.LAZY)
    private Docente docente;
    @OneToMany(mappedBy = "Grado")
    private Set<Grado> grado;

    public Integer getIdGrupo() {return idGrupo;}

    public void setIdGrupo(Integer idGrupo) {this.idGrupo = idGrupo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Docente getDocente() {return docente;}

    public void setDocente(Docente docente) {this.docente = docente;}

    public Set<Grado> getGrado() {return grado;}

    public void setGrado(Set<Grado> grado) {this.grado = grado;}
}
