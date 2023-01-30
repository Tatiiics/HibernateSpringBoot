package com.springhibernate.springHibernate.Core.Services.Impl;

import com.springhibernate.springHibernate.Core.Services.IEmpleadosService;
import com.springhibernate.springHibernate.Data.Providers.IEmpleadosProvider;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmpleadosService implements IEmpleadosService {

    private final IEmpleadosProvider empleadosProvider;

    @Override
    public List<EmpleadosDto> getListaEmpleados() {

        return empleadosProvider.getEmpleados();
    }

    @Override
    public EmpleadosDto getEmpleadosId(Integer id) {

        return empleadosProvider.getEmpleadosId(id);
    }

    @Override
    public EmpleadosDto insertEmpleados(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {

        return empleadosProvider.insertEmpleados( nombre, apellido, dni, salario, departamento_Id,  proyecto_id);
    }

    @Override
    public EmpleadosDto updateEmpleados(Integer id, String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {

        return empleadosProvider.updateEmpleados(id, nombre, apellido, dni, salario, departamento_Id, proyecto_id);
    }

    @Override
    public void deleteEmpleadosId(Integer id) {
        
        empleadosProvider.deleteEmpleadosId(id);
    }

}
