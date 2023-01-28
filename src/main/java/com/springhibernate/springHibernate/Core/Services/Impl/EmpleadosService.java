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
}
