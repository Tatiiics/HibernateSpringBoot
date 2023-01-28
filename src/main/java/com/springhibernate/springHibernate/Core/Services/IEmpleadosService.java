package com.springhibernate.springHibernate.Core.Services;

import com.springhibernate.springHibernate.Dtos.EmpleadosDto;

import java.util.List;

public interface IEmpleadosService {

    List<EmpleadosDto> getListaEmpleados();
}
