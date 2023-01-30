package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IEmpleadosService;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/empleados")

public class EmpleadosController {

    private final IEmpleadosService empleadosService;

    @GetMapping ("/lista")
    public List <EmpleadosDto> listaEmpleados () {

        return empleadosService.getListaEmpleados();
    }

    @PostMapping ("/insertar")
    public EmpleadosDto empleadosDto(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {
        return empleadosService.insertEmpleados(nombre, apellido, dni, salario, departamento_Id, proyecto_id);
    }

}
