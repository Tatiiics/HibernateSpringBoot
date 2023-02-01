package com.springhibernate.springHibernate.Core.Services;

import com.springhibernate.springHibernate.Dtos.ProyectosDto;

import java.util.List;

public interface IProyectosService {

    List<ProyectosDto> getListaProyectos();
    ProyectosDto getProyectosId(Integer id);
    ProyectosDto insertProyectos(String nombre, Integer presupuesto, Integer departamento_id);
    ProyectosDto updateProyectos(Integer id, String nombre, Integer presupuesto, Integer departamento_id);
    void deleteProyectosId(Integer id);

}
