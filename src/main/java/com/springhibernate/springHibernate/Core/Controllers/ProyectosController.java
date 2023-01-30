package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IProyectosService;
import com.springhibernate.springHibernate.Dtos.ProyectosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
