package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;

import java.util.List;

public interface IEmpleadosProvider {

    List<EmpleadosDto> getEmpleados();
}
