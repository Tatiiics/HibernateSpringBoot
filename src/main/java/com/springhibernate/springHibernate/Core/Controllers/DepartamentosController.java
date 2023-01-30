package com.springhibernate.springHibernate.Core.Controllers;

import com.springhibernate.springHibernate.Core.Services.IDepartamentosService;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping ("/departamentos")
public class DepartamentosController {

    private final IDepartamentosService departamentosService;

    @GetMapping ("/lista")
    public List<DepartamentosDto> listaDepartamentos(){

        return departamentosService.getListaDepartamentos();
    }

    @GetMapping ("/buscar/{id}")
    public DepartamentosDto buscarDepartamentoId(@PathVariable Integer id) {

        return departamentosService.getDepartamentosId(id);
    }

    @PostMapping ("/insertar")
    public DepartamentosDto insertarDepartamento(String nombre, Integer presupuesto, Integer gastos) {

        return departamentosService.insertDepartamentos(nombre, presupuesto, gastos);
    }

    @PutMapping ("/actualizar/{id}")
    public DepartamentosDto updateDepartamento(@PathVariable Integer id,String nombre, Integer presupuesto, Integer gastos){

        return departamentosService.updateDepartamentos(id, nombre, presupuesto, gastos);
    }

    @DeleteMapping ("/borrar/{id}")
    public void borrarDepartamento (@PathVariable Integer id) {

        departamentosService.deleteDepartamentosId(id);
    }
}
