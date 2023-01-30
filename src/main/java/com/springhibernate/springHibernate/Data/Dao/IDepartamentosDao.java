package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDepartamentosDao extends JpaRepository<DepartamentosModel, Integer> {
    Optional<DepartamentosModel> findById(Integer id);
}
