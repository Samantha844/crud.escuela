package com.example.crud.modulos.asignatura.servicio;

import com.example.crud.modelos.Alumno;
import com.example.crud.modelos.Asignatura;
import com.example.crud.modulos.asignatura.dto.AsignaturaDTO;
import com.example.crud.repositorios.AsignaturaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AsignaturaServicio {
//    @Autowired
//    private AsignaturaRepositorio asignaturaRepositorio;
//
//    public List<AsignaturaDTO> obtenerAsignaturas(){
//
//        List<Asignatura> lista = asignaturaRepositorio.findAll();
//        return  lista.stream().map(AsignaturaDTO::new).collect(Collectors.toList());
//    }
//
//    public AsignaturaDTO obtenerAsignaturasPorId(Integer idAsignatura){
//        Optional<Asignatura> asignatura = asignaturaRepositorio.findById(idAsignatura);
//
//        if (asignatura.isPresent()){
//            return new AsignaturaDTO(asignatura.get().getIdAsignatura(), asignatura.get().getNombre(),asignatura.get().getDescripcion(),asignatura.get().getAlumno());
//        }
//
//        return null;
//    }
//
//    public Boolean guardarAsignatura(AsignaturaDTO parametros) {
//
//        Asignatura asignatura = new Asignatura();
//
//        if (parametros.getIdAsignatura() != null){
//            asignatura = asignaturaRepositorio.getOne(parametros.setIdAsignatura());
//        }
//
//        asignatura.setIdAsignatura(parametros.getIdAsignatura());
//        asignatura.setNombre(parametros.getNombre());
//        asignatura.setDescripcion(parametros.getDescripcion());
//        asignatura.setAlumno(new Alumno(parametros.getAlumno()));
//
//        asignaturaRepositorio.save(asignatura);
//        return true;
//    }
//
//    public Boolean actualizarAsignatura(AsignaturaDTO parametros) {
//
//        Asignatura asignatura = asignaturaRepositorio.getOne(parametros.getIdAsignatura());
//        asignatura.setNombre(parametros.getNombre());
//        asignatura.setDescripcion(parametros.getDescripcion());
//
//        asignaturaRepositorio.save(asignatura);
//        return true;
//    }
//
//    public Boolean eliminarAsignatura(Integer idAsignatura) {
//        Asignatura asignatura = asignaturaRepositorio.getOne(idAsignatura);
//
//        asignaturaRepositorio.delete(asignatura);
//        return true;
//    }
//
//    public Boolean activarInactivarAsignatura(Integer idAsignatura) {
//        Asignatura asignatura = asignaturaRepositorio.getOne(idAsignatura);
//        asignaturaRepositorio.save(asignatura);
//        return true;
//    }

}
