package com.example.crud.modulos.colegiatura.dto;

import com.example.crud.modelos.Alumno;

import java.time.ZonedDateTime;
import java.util.BitSet;

public class ColegiaturaDTO {

    private Integer idColegiatura;
    private Integer monto;
    private ZonedDateTime mes;
    private BitSet pagado;
    private Alumno alumno;

    public ColegiaturaDTO(Integer idColegiatura, Integer monto, ZonedDateTime mes, BitSet pagado, Alumno alumno) {
        this.idColegiatura = idColegiatura;
        this.monto = monto;
        this.mes = mes;
        this.pagado = pagado;
        this.alumno = alumno;
    }

    public Integer getIdColegiatura() {return idColegiatura;}

    public void setIdColegiatura(Integer idColegiatura) {this.idColegiatura = idColegiatura;}

    public Integer getMonto() {return monto;}

    public void setMonto(Integer monto) {this.monto = monto;}

    public ZonedDateTime getMes() {return mes;}

    public void setMes(ZonedDateTime mes) {this.mes = mes;}

    public BitSet getPagado() {return pagado;}

    public void setPagado(BitSet pagado) {this.pagado = pagado;}

    public Alumno getAlumno() {return alumno;}

    public void setAlumno(Alumno alumno) {this.alumno = alumno;}
}
