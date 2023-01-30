package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IDepartamentosService;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/departamentos")
public class DepartamentosController {

    private final IDepartamentosService departamentosService;

    @GetMapping("/lista")
    public List<DepartamentosDto> listaDepartamentos(){

        return departamentosService.getListaDepartamentos();
    }
}
