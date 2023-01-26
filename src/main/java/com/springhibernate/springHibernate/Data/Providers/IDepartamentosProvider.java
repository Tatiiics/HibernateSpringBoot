package com.springhibernate.springHibernate.Data.Providers;

import com.springhibernate.springHibernate.Dtos.DepartamentosDto;

import java.util.List;

public interface IDepartamentosProvider {
    List<DepartamentosDto> getDepartamentos();
}
