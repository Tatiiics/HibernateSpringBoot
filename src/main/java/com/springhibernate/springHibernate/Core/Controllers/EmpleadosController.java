package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IEmpleadosService;
import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
