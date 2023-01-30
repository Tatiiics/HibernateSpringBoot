package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IEmpleadosDao extends JpaRepository<EmpleadosModel, Integer> {
    //CREAR CONSULTAS AQUI
    //  -SELECT, INSERT, DELETE . . .
    Optional<EmpleadosModel> findById(Integer id);

}
