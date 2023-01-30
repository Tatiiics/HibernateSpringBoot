package com.springhibernate.springHibernate.Core.Services;

import com.springhibernate.springHibernate.Dtos.EmpleadosDto;

import java.util.List;

public interface IEmpleadosService {

    List<EmpleadosDto> getListaEmpleados();
    EmpleadosDto getEmpleadosId(Integer id);
    EmpleadosDto insertEmpleados(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id);
    EmpleadosDto updateEmpleados(EmpleadosDto empleadosDto);
    void deleteEmpleadosId(Integer id);

}
