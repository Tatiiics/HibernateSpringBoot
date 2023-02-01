package com.springhibernate.springHibernate.Data.Providers.Impl;

import com.springhibernate.springHibernate.Data.Dao.IDepartamentosDao;
import com.springhibernate.springHibernate.Data.Dao.IProyectosDao;
import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
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
    private final IDepartamentosDao iDepartamentosDao;
    private final IMapper<ProyectosModel, ProyectosDto> mapperProyectos;

    @Override
    public List<ProyectosDto> getProyectos() {
        return iProyectosDao.findAll().stream()
                .map(mapperProyectos::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProyectosDto getProyectosId(Integer id) {
        return iProyectosDao.findById(id)
                .map(mapperProyectos::mapToDto)
                .orElse(null);
    }

    @Override
    public ProyectosDto insertProyectos(String nombre, Integer presupuesto, Integer departamento_id) {
        //Para el Departamento_id
        DepartamentosModel departamento = iDepartamentosDao.findById(departamento_id).orElse(null);

        ProyectosModel newProyecto = ProyectosModel.builder()//para insertar un nuevo  registro
                .nombre(nombre)
                .presupuesto(presupuesto)
                .departamento(departamento)
                .build();

        iProyectosDao.save(newProyecto);//Para guardarlo
        return mapperProyectos.mapToDto(newProyecto);
    }

    @Override
    public ProyectosDto updateProyectos(Integer id, String nombre, Integer presupuesto, Integer departamento_id) {

        DepartamentosModel departamento = iDepartamentosDao.findById(departamento_id).orElse(null);
        ProyectosModel proyecto= iProyectosDao.findById(id).orElse(null);

        proyecto = proyecto.builder()
                .proyecto_id(id)
                .nombre(nombre)
                .presupuesto(presupuesto)
                .departamento(departamento)
                .build();
        iProyectosDao.save(proyecto);

        return mapperProyectos.mapToDto(proyecto);
    }

    @Override
    public void deleteProyectosId(Integer id) {
        if(!iProyectosDao.existsById(id)){
            throw  new RuntimeException("USUARIO NO EXISTE");
        }
        iProyectosDao.deleteById(id);
    }
}
