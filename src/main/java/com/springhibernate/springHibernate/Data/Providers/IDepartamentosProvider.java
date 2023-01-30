package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Dtos.DepartamentosDto;

import java.util.List;

public interface IDepartamentosProvider {

    List<DepartamentosDto> getDepartamentos();
    DepartamentosDto getDepartamentosId(Integer id);
    DepartamentosDto insertDepartamentos(String nombre, Integer presupuesto, Integer gastos);
    DepartamentosDto updateDepartamentos(Integer id, String nombre, Integer presupuesto, Integer gastos);
    void deleteDepartamentosId(Integer id);

}
