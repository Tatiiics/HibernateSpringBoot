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

    @Override
    public DepartamentosDto getDepartamentosId(Integer id) {
        return iDepartamentosDao.findById(id)
                .map(mappperDepartamentos::mapToDto)
                .orElse(null);
    }

    @Override
    public DepartamentosDto insertDepartamentos(String nombre, Integer presupuesto, Integer gastos) {

        DepartamentosModel newDepartamento = DepartamentosModel.builder()
                .nombre(nombre)
                .presupuesto(presupuesto)
                .gastos(gastos)
                .build();

        iDepartamentosDao.save(newDepartamento);

        return mappperDepartamentos.mapToDto(newDepartamento);
    }

    @Override
    public DepartamentosDto updateDepartamentos(Integer id, String nombre, Integer presupuesto, Integer gastos) {

        DepartamentosModel departamento = iDepartamentosDao.findById(id).orElse(null);

        departamento = departamento.builder()
                .departamento_id(id)
                .nombre(nombre)
                .presupuesto(presupuesto)
                .gastos(gastos)
                .build();

        iDepartamentosDao.save(departamento);

        return mappperDepartamentos.mapToDto(departamento);
    }

    @Override
    public void deleteDepartamentosId(Integer id) {

        if(!iDepartamentosDao.existsById(id)) {

            throw new RuntimeException("USUARIO NO EXISTE");
        }
        iDepartamentosDao.deleteById(id);

    }
}
