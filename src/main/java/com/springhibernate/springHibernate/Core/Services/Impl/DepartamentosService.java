package com.springhibernate.springHibernate.Core.Services.Impl;

import com.springhibernate.springHibernate.Core.Services.IDepartamentosService;
import com.springhibernate.springHibernate.Data.Providers.IDepartamentosProvider;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DepartamentosService implements IDepartamentosService {

    private final IDepartamentosProvider departamentosProvider;

    @Override
    public List<DepartamentosDto> getListaDepartamentos() {

        return departamentosProvider.getDepartamentos();
    }

    @Override
    public DepartamentosDto getDepartamentosId(Integer id) {

        return departamentosProvider.getDepartamentosId(id);
    }

    @Override
    public DepartamentosDto insertDepartamentos(String nombre, Integer presupuesto, Integer gastos) {

        return departamentosProvider.insertDepartamentos(nombre, presupuesto, gastos);
    }

    @Override
    public DepartamentosDto updateDepartamentos(Integer id, String nombre, Integer presupuesto, Integer gastos) {

        return departamentosProvider.updateDepartamentos(id, nombre, presupuesto, gastos);
    }

    @Override
    public void deleteDepartamentosId(Integer id) {

        departamentosProvider.deleteDepartamentosId(id);
    }
}
