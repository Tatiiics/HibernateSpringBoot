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

    @Override
    public ProyectosDto getProyectosId(Integer id) {
        return proyectosProvider.getProyectosId(id);
    }

    @Override
    public ProyectosDto insertProyectos(String nombre, Integer presupuesto, Integer departamento_id) {
        return proyectosProvider.insertProyectos(nombre, presupuesto, departamento_id);
    }

    @Override
    public ProyectosDto updateProyectos(Integer id, String nombre, Integer presupuesto, Integer departamento_id) {
        return proyectosProvider.updateProyectos(id, nombre, presupuesto, departamento_id);
    }



    @Override
    public void deleteProyectosId(Integer id) {
        proyectosProvider.deleteProyectosId(id);
    }
}
