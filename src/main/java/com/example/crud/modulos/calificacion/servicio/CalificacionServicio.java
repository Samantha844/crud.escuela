package com.example.crud.modulos.calificacion.servicio;

import com.example.crud.modelos.Alumno;
import com.example.crud.modelos.Asignatura;
import com.example.crud.modelos.Calificacion;
import com.example.crud.modelos.Persona;
import com.example.crud.modulos.calificacion.dto.CalificacionDTO;
import com.example.crud.repositorios.CalificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CalificacionServicio {
//    @Autowired
//    private CalificacionRepositorio calificacionRepositorio;
//
//    public List<CalificacionDTO> obtenerCalificaciones(){
//
//        List<Calificacion> lista = calificacionRepositorio.findAll();
//        return  lista.stream().map(CalificacionDTO::new).collect(Collectors.toList());
//    }
//
//    public CalificacionDTO obtenerCalificacionesPorId(Integer idCalificacion){
//        Optional<Calificacion> calificacion = calificacionRepositorio.findById(idCalificacion);
//
//        if (calificacion.isPresent()){
//            return new CalificacionDTO(calificacion.get().getIdCalificacion(),calificacion.get().getSemestre(),calificacion.get().getMateria(),calificacion.get().getAlumno(),calificacion.get().getAsignatura());
//        }
//
//        return null;
//    }
//
//    public Boolean guardarCalificacion(CalificacionDTO parametros) {
//
//        Calificacion calificacion = new Calificacion();
//
//        if (parametros.getIdCalificacion() != null){
//            calificacion = calificacionRepositorio.getOne(parametros.setIdCalificacion());
//        }
//
//        calificacion.setSemestre(parametros.getSemestre());
//        calificacion.setMateria(parametros.getMateria());
//        calificacion.setAlumno(new Alumno(parametros.getAlumno()));
//        calificacion.setAsignatura(new Asignatura(parametros.getAsignatura());
//
//        calificacionRepositorio.save(calificacion);
//        return true;
//    }
//
//    public Boolean actualizarCalificacion(CalificacionDTO parametros) {
//
//        Calificacion calificacion = calificacionRepositorio.getOne(parametros.getIdCalificacion());
//        calificacion.setSemestre(parametros.getSemestre());
//        calificacion.setMateria(parametros.getMateria());
//        calificacion.setAlumno((Alumno) parametros.getAlumno());
//        calificacion.setAsignatura((Asignatura) parametros.getAsignatura());
//
//        calificacionRepositorio.save(calificacion);
//        return true;
//    }
//
//    public Boolean eliminarCalificacion(Integer idCalificacion) {
//        Calificacion calificacion = calificacionRepositorio.getOne(idCalificacion);
//
//        calificacionRepositorio.delete(calificacion);
//        return true;
//    }
//
//    public Boolean activarInactivarCalificacion(Integer idCalificacion) {
//        Calificacion calificacion = calificacionRepositorio.getOne(idCalificacion);
////        asignatura.setRegistroActivo(!asignatura.getRegistroActivo());
//
//        calificacionRepositorio.save(calificacion);
//        return true;
//    }
}
