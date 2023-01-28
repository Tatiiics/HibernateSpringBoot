package com.springhibernate.springHibernate.Core.Services.Impl;

import com.springhibernate.springHibernate.Core.Services.IProyectosService;
import com.springhibernate.springHibernate.Data.Providers.IProyectosProvider;
import com.springhibernate.springHibernate.Dtos.ProyectosDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class ProyectosService implements IProyectosService {
    private final IProyectosProvider proyectosProvider;
    @Override
    public List<ProyectosDto> getListaProyectos() {

        return proyectosProvider.getProyectos();
    }
}
