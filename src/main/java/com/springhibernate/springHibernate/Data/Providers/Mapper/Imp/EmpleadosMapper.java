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
                .id_empleado(empleadosModel.getEmpleado_id())
                .nombre(empleadosModel.getNombre())
                .apellidos(empleadosModel.getApellidos())
                .dni(empleadosModel.getDni())
                .salario(empleadosModel.getSalario())
                .idDepartamentos(empleadosModel.getDepartamento().getDepartamento_id())
                .idProyectos(empleadosModel.getProyecto().getProyecto_id())
                .build();
    }

    @Override
    public EmpleadosModel mapToEntity(EmpleadosDto empleadosDto) {
        return null;
    }
}
