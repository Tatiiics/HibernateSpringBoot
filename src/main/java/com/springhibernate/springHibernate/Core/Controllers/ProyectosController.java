package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IProyectosService;
import com.springhibernate.springHibernate.Dtos.ProyectosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/proyectos")
public class ProyectosController {

    private final IProyectosService proyectosService;

    @GetMapping("/lista")
    public List<ProyectosDto> listaProyectos(){

        return proyectosService.getListaProyectos();

    }
    // GET = SELECT...
    @GetMapping ("/buscar/{id}")
    public ProyectosDto buscarProyectoId(@PathVariable Integer id){

        return proyectosService.getProyectosId(id);
    }
    //POST = INSERT...
    @PostMapping("/insertar")
    public ProyectosDto insertarProyecto(String nombre, Integer presupuesto, Integer departamento_id ){

        return proyectosService.insertProyectos(nombre, presupuesto, departamento_id);
    }
    //PUT = UPDATE...
    @PutMapping("/actualizar/{id}")
    public ProyectosDto updateProyecto(@PathVariable Integer id, String nombre, Integer presupuesto, Integer departamento_id ){

        return proyectosService.updateProyectos(id, nombre, presupuesto,  departamento_id);
    }
    //DELETE = DELETE...
    @DeleteMapping("/borrar/{id}")
    public void borrarProyecto(@PathVariable Integer id){

        proyectosService.deleteProyectosId(id);
    }

}
