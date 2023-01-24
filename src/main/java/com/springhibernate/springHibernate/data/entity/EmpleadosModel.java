package com.springhibernate.springHibernate.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name="Empleados")

public class EmpleadosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincremento del id
    private int id_empleado;
    @Column(nullable = false) //Para que no sea null el valor nombre
    private String nombre;

    private String apellidos;
    @Column(nullable = false)
    private String dni;
    @Column(nullable = false)
    private int salario;
    @ManyToOne
    @JoinColumn(name = "idDepartamentos")
    private DepartamentosModel idDepartamentos;
    @ManyToOne
    @JoinColumn(name = "idProyectos")
    private ProyectosModel idProyectos;

}
