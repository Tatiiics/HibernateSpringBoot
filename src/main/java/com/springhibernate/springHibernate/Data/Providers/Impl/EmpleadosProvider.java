package com.springhibernate.springHibernate.Data.Providers.Impl;

import com.springhibernate.springHibernate.Data.Dao.IDepartamentosDao;
import com.springhibernate.springHibernate.Data.Dao.IEmpleadosDao;
import com.springhibernate.springHibernate.Data.Dao.IProyectosDao;
import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Data.Entities.ProyectosModel;
import com.springhibernate.springHibernate.Data.Providers.IEmpleadosProvider;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Data.Providers.Mapper.Imp.EmpleadosMapper;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpleadosProvider implements IEmpleadosProvider {

    private final IEmpleadosDao iEmpleadosDao;
    private final IDepartamentosDao iDepartamentosDao;
    private final IProyectosDao iProyectosDao;

    private final IMapper <EmpleadosModel, EmpleadosDto> mapperEmpleados;

    @Override
    public List<EmpleadosDto> getEmpleados() {
        return iEmpleadosDao.findAll().stream()
                .map(mapperEmpleados::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmpleadosDto getEmpleadosId(Integer id) {
        return iEmpleadosDao.findById(id)
                .map(mapperEmpleados::mapToDto)
                .orElse(null);
    }

    @Override
    public EmpleadosDto insertEmpleados(String nombre, String apellido, String dni, Integer salario, Integer departamento_Id, Integer proyecto_id) {

        DepartamentosModel departamento = iDepartamentosDao.findById(departamento_Id).orElse(null);
        ProyectosModel proyecto = iProyectosDao.findById(proyecto_id).orElse(null);

        EmpleadosModel newEmpleado = EmpleadosModel.builder()
                .nombre(nombre)
                .apellidos(apellido)
                .dni(dni)
                .salario(salario)
                .departamento(departamento)
                .proyecto(proyecto)
                .build();

        iEmpleadosDao.save(newEmpleado);


        return mapperEmpleados.mapToDto(newEmpleado);
    }

    @Override
    public EmpleadosDto updateEmpleados(EmpleadosDto empleadosDto) {
        return null;
    }

    @Override
    public void deleteEmpleadosId(Integer id) {
        iEmpleadosDao.deleteById(id);
    }


}
