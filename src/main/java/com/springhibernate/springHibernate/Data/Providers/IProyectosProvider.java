package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Dtos.ProyectosDto;

import java.util.List;

public interface IProyectosProvider {

    List<ProyectosDto> getProyectos();

}
