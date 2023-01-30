package com.springhibernate.springHibernate.Data.Providers.Mapper.Imp;

import com.springhibernate.springHibernate.Data.Dao.IDepartamentosDao;
import com.springhibernate.springHibernate.Data.Dao.IProyectosDao;
import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EmpleadosMapper  implements IMapper <EmpleadosModel, EmpleadosDto> {

    private final IDepartamentosDao iDepartamentosDao;
    private final IProyectosDao iProyectosDao;

    @Override
    public EmpleadosDto mapToDto(EmpleadosModel empleadosModel) {

        return EmpleadosDto.builder()
                .id_empleado(empleadosModel.getEmpleado_id())
                .nombre(empleadosModel.getNombre())
                .apellidos(empleadosModel.getApellidos())
                .dni(empleadosModel.getDni())
                .salario(empleadosModel.getSalario())
                .idDepartamentos((empleadosModel.getDepartamento()==null)? null: empleadosModel.getDepartamento().getDepartamento_id())
                .idProyectos((empleadosModel.getProyecto()==null)? null: empleadosModel.getProyecto().getProyecto_id())
                .build();
    }

    @Override
    public EmpleadosModel mapToEntity(EmpleadosDto empleadosDto) {

        return EmpleadosModel.builder()
                .nombre(empleadosDto.getNombre())
                .apellidos(empleadosDto.getApellidos())
                .dni(empleadosDto.getDni())
                .salario(empleadosDto.getSalario())
                .departamento(iDepartamentosDao.findById(empleadosDto.getIdDepartamentos()).orElse(null))
                .proyecto(iProyectosDao.findById(empleadosDto.getIdProyectos()).orElse(null))
                .build();
    }
}
