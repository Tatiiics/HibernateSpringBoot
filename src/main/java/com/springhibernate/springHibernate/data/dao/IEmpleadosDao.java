package com.springhibernate.springHibernate.data.dao;

import com.springhibernate.springHibernate.data.entity.EmpleadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadosDao extends JpaRepository<EmpleadosModel, Integer> {
    //CREAR CONSULTAS AQUI
    //  -INSERT, SELECT, UPDATE, . . .

}
