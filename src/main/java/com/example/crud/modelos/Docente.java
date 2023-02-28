package com.example.crud.modelos;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "docente")
public class Docente  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idDocente;

    @Column
    private String rfc;

    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne (fetch = FetchType.LAZY)
    private Persona persona;

    @OneToMany(mappedBy = "docente")
    private Set<Grupo> grupo;


    public Integer getIdDocente() {return idDocente;}

    public void setIdDocente(Integer idDocente) {this.idDocente = idDocente;}

    public String getRfc() {return rfc;}

    public void setRfc(String rfc) {this.rfc = rfc;}

    public Persona getPersona() {return persona;}

    public void setPersona(Persona persona) {this.persona = persona;}

    public Set<Grupo> getGrupo() {return grupo;}

    public void setGrupo(Set<Grupo> grupo) {this.grupo = grupo;}
}
