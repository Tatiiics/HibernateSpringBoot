package com.springhibernate.springHibernate.Core.Services.Impl;

import com.springhibernate.springHibernate.Core.Services.IDepartamentosService;
import com.springhibernate.springHibernate.Data.Providers.IDepartamentosProvider;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DepartamentosService implements IDepartamentosService {

    private final IDepartamentosProvider departamentosProvider;
    @Override
    public List<DepartamentosDto> getListaDepartamentos() {
        return departamentosProvider.getDepartamentos();
    }
}
