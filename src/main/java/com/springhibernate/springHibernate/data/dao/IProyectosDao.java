package com.springhibernate.springHibernate.data.dao;

import com.springhibernate.springHibernate.data.entity.ProyectosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProyectosDao extends JpaRepository<ProyectosModel, Integer> {

}
