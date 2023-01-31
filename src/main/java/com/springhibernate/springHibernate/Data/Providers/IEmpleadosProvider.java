package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import java.util.List;


public interface IEmpleadosProvider {

    List<EmpleadosDto> getEmpleados();
    EmpleadosDto getEmpleadosId(Integer id);
    EmpleadosDto insertEmpleados(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id);//a revisar
    EmpleadosDto updateEmpleados(Integer id, String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id);//a revisar
    void deleteEmpleadosId(Integer id);

}
