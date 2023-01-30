package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import com.springhibernate.springHibernate.Data.Entities.ProyectosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IProyectosDao extends JpaRepository<ProyectosModel, Integer> {

    Optional<ProyectosModel> findById(Integer id);
}
