package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Dtos.ProyectosDto;

import java.util.List;

public interface IProyectosProvider {

    List<ProyectosDto> getProyectos();
    ProyectosDto getProyectosId(Integer id);
    ProyectosDto insertProyectos(String nombre, String presupuesto, Integer departamento_id);// a revisar
    ProyectosDto updateProyectos(Integer id, String nombre, String presupuesto, Integer idDepartamentos);// a revisar
    void deleteProyectosId(Integer id);
}
