package com.springhibernate.springHibernate.Data.Providers.Impl;

import com.springhibernate.springHibernate.Data.Dao.IProyectosDao;
import com.springhibernate.springHibernate.Data.Entities.ProyectosModel;
import com.springhibernate.springHibernate.Data.Providers.IProyectosProvider;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.ProyectosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProyectosProvider implements IProyectosProvider {

    private final IProyectosDao iProyectosDao;
    private final IMapper<ProyectosModel, ProyectosDto> mapperProyectos;

    @Override
    public List<ProyectosDto> getProyectos() {
        return iProyectosDao.findAll().stream()
                .map(mapperProyectos::mapToDto)
                .collect(Collectors.toList());
    }
}
