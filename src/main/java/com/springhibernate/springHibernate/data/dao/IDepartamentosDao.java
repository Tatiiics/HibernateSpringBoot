package com.springhibernate.springHibernate.data.dao;

import com.springhibernate.springHibernate.data.entity.DepartamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentosDao extends JpaRepository<DepartamentosModel, Integer> {
}
