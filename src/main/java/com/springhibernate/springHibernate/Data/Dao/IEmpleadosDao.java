package com.springhibernate.springHibernate.Data.Dao;

import com.springhibernate.springHibernate.Data.Entities.EmpleadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadosDao extends JpaRepository<EmpleadosModel, Integer> {
    //CREAR CONSULTAS AQUI
    //  -INSERT, SELECT, UPDATE, . . .

}
