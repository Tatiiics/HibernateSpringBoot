package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;

import java.util.List;
import java.util.Optional;

public interface IEmpleadosProvider {

    List<EmpleadosDto> getEmpleados();
    EmpleadosDto getEmpleadosId(Integer id);
    EmpleadosDto insertEmpleados(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id);
    EmpleadosDto updateEmpleados(Integer id, String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id);
    void deleteEmpleadosId(Integer id);

}
