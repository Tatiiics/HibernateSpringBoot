package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IEmpleadosService;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/empleados")

public class EmpleadosController {

    private final IEmpleadosService empleadosService;

    // GET = SELECT...
    @GetMapping ("/lista")
    public List <EmpleadosDto> listaEmpleados () {

        return empleadosService.getListaEmpleados();
    }
    // GET = SELECT...
    @GetMapping ("/buscar/{id}")
    public EmpleadosDto buscarEmpleadoId(@PathVariable Integer id) {

        return empleadosService.getEmpleadosId(id);
    }
    // POST = INSERT...
    @PostMapping ("/insertar")
    public EmpleadosDto inserterEmpleado(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {

        return empleadosService.insertEmpleados(nombre, apellido, dni, salario, departamento_Id, proyecto_id);
    }
    // PUT = UPDATE...
    @PutMapping ("/actualizar/{id}")
    public EmpleadosDto updateEmpleado(@PathVariable Integer id, String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {

        return empleadosService.updateEmpleados(id, nombre, apellido, dni, salario, departamento_Id, proyecto_id);
    }
    // DELETE = DELETE...
    @DeleteMapping ("/borrar/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public void borrarEmpleado (@PathVariable Integer id) {

       empleadosService.deleteEmpleadosId(id);
    }

}
