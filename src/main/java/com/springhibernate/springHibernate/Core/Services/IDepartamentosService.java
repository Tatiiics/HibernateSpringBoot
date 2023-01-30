package com.springhibernate.springHibernate.Core.Services;

import com.springhibernate.springHibernate.Dtos.DepartamentosDto;

import java.util.List;

public interface IDepartamentosService {

    List<DepartamentosDto> getListaDepartamentos();
    DepartamentosDto getDepartamentosId(Integer id);
    DepartamentosDto insertDepartamentos(String nombre, Integer presupuesto, Integer gastos);
    DepartamentosDto updateDepartamentos(Integer id, String nombre, Integer presupuesto, Integer gastos);
    void deleteDepartamentosId(Integer id);

}
