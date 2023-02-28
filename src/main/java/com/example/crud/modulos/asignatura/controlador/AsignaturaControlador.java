package com.example.crud.modulos.asignatura.controlador;

import com.example.crud.modulos.asignatura.dto.AsignaturaDTO;
import com.example.crud.modulos.asignatura.servicio.AsignaturaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asignatura")
public class AsignaturaControlador {
//
//    @Autowired
//    private AsignaturaServicio asignaturaServicio;
//
//    @GetMapping("obtener")
//    public ResponseEntity<List<AsignaturaDTO>> obtenerAsignaturas(){
//        List<AsignaturaDTO> respuesta = asignaturaServicio.obtenerAsignaturas();
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }
//
//    @GetMapping("obtener/id")
//    public ResponseEntity<AsignaturaDTO> obtenerAsignaturasPorId(@RequestParam Integer idCine){
//        AsignaturaDTO respuesta = asignaturaServicio.obtenerAsignaturasPorId(idCine);
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }
//
//    @PostMapping("guardar")
//    public ResponseEntity<Boolean> guardarAsignatura(@RequestBody AsignaturaDTO parametros){
//        Boolean respuesta = asignaturaServicio.guardarAsignatura(parametros);
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }
//
//    @PutMapping("actualizar")
//    public ResponseEntity<Boolean> actualizarAsignatura(@RequestBody AsignaturaDTO parametros){
//        Boolean respuesta = asignaturaServicio.actualizarAsignatura(parametros);
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }
//    @DeleteMapping("eliminar")
//    public ResponseEntity<Boolean> eliminarAsignatura(@RequestParam Integer idAsignatura){
//        Boolean respuesta = asignaturaServicio.eliminarAsignatura(idAsignatura);
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }
//
//    @PutMapping("activar-inactivar")
//    public ResponseEntity<Boolean> activarInactivarAsignatura(@RequestBody Integer idAsignatura){
//        Boolean respuesta = asignaturaServicio.activarInactivarAsignatura(idAsignatura);
//        return new ResponseEntity<>(respuesta, HttpStatus.OK);
//    }

}
