package com.springhibernate.springHibernate.Data.Providers.Mapper.Imp;

import com.springhibernate.springHibernate.Data.Entities.ProyectosModel;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.ProyectosDto;
import org.springframework.stereotype.Component;

@Component
public class ProyectosMapper implements IMapper<ProyectosModel, ProyectosDto> {
    @Override
    public ProyectosDto mapToDto(ProyectosModel proyectosModel) {
        return ProyectosDto.builder()
                .idProyecto(proyectosModel.getProyecto_id())
                .nombre(proyectosModel.getNombre())
                .presupuesto(proyectosModel.getPresupuesto())
                .idDepartamentos(proyectosModel.getDepartamento().getDepartamento_id())
                .build();
    }

    @Override
    public ProyectosModel mapToEntity(ProyectosDto proyectosDto) {
        return null;
    }
}
