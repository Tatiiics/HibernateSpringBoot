package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.DepartamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentosDao extends JpaRepository<DepartamentosModel, Integer> {
}
