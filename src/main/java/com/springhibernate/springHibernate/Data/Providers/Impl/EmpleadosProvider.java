package com.springhibernate.springHibernate.Data.Providers.Impl;

import com.springhibernate.springHibernate.Data.Dao.IEmpleadosDao;
import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Data.Providers.IEmpleadosProvider;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Data.Providers.Mapper.Imp.EmpleadosMapper;
import com.springhibernate.springHibernate.Dtos.EmpleadosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpleadosProvider implements IEmpleadosProvider {

    private final IEmpleadosDao iEmpleadosDao;
    private final IMapper <EmpleadosModel, EmpleadosDto> mapperEmpleados;

    @Override
    public List<EmpleadosDto> getEmpleados() {
        return iEmpleadosDao.findAll().stream()
                .map(mapperEmpleados::mapToDto)
                .collect(Collectors.toList());
    }
}
