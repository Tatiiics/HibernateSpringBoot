package com.springhibernate.springHibernate.Data.Providers.Impl;

import com.springhibernate.springHibernate.Data.Dao.IDepartamentosDao;
import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
import com.springhibernate.springHibernate.Data.Providers.IDepartamentosProvider;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class DepartamentosProvider  implements IDepartamentosProvider {
    private final IDepartamentosDao iDepartamentosDao;
    private final IMapper <DepartamentosModel, DepartamentosDto> mappperDepartamentos;
    @Override
    public List<DepartamentosDto> getDepartamentos() {
        return iDepartamentosDao.findAll().stream()
                .map(mappperDepartamentos::mapToDto)
                .collect(Collectors.toList());
    }
}
