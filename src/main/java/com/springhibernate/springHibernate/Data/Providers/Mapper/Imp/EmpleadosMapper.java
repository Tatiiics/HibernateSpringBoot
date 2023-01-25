package com.springhibernate.springHibernate.Data.Providers.Mapper.Imp;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import org.springframework.stereotype.Component;

@Component
public class EmpleadosMapper  implements IMapper <EmpleadosModel, EmpleadosDto> {
    @Override
    public EmpleadosDto mapToDto(EmpleadosModel empleadosModel) {
        return EmpleadosDto.builder()
                .id_empleado(empleadosModel.getId_empleado())
                .nombre(empleadosModel.getNombre())
                .apellidos(empleadosModel.getApellidos())
                .dni(empleadosModel.getDni())
                .salario(empleadosModel.getSalario())
                .idDepartamentos(empleadosModel.getDepartamento().getCodigo())
                .idProyectos(empleadosModel.getProyecto().getIdProyecto())
                .build();
    }

    @Override
    public EmpleadosModel mapToEntity(EmpleadosDto empleadosDto) {
        return null;
    }
}
