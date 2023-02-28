package com.example.crud.modelos;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.BitSet;

@Entity
@Table(name = "colegiatura")
public class Colegiatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer idColegiatura;
    @Column
    private Integer monto;
    @Column
    private ZonedDateTime mes;
    @Column
    private BitSet pagado;

    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    @ManyToOne (fetch = FetchType.LAZY)
    private Alumno alumno;

    public Integer getIdColegiatura() {return idColegiatura;}

    public void setIdColegiatura(Integer idColegiatura) {this.idColegiatura = idColegiatura;}

    public Integer getMonto() {return monto;}

    public void setMonto(Integer monto) {this.monto = monto;}

    public ZonedDateTime getMes() {return mes;}

    public void setMes(ZonedDateTime mes) {this.mes = mes;}

    public BitSet getPagado() {return pagado;}

    public void setPagado(BitSet pagado) {this.pagado = pagado;}


}
