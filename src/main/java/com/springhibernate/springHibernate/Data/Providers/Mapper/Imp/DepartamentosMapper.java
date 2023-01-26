package com.springhibernate.springHibernate.Data.Providers.Mapper.Imp;

import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
import com.springhibernate.springHibernate.Data.Providers.Mapper.IMapper;
import com.springhibernate.springHibernate.Dtos.DepartamentosDto;
import org.springframework.stereotype.Component;

@Component
public class DepartamentosMapper implements IMapper<DepartamentosModel, DepartamentosDto> {

    @Override
    public DepartamentosDto mapToDto(DepartamentosModel departamentosModel) {
        return DepartamentosDto.builder()
                .codigo(departamentosModel.getCodigo())
                .nombre(departamentosModel.getNombre())
                .presupuesto(departamentosModel.getPresupuesto())
                .gastos(departamentosModel.getGastos())
                .build();
    }

    @Override
    public DepartamentosModel mapToEntity(DepartamentosDto departamentosDto) {
        return null;
    }
}
