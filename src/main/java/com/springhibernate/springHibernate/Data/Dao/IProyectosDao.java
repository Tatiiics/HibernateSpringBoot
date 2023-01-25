package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.ProyectosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProyectosDao extends JpaRepository<ProyectosModel, Integer> {

}
