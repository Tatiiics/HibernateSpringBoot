package com.springhibernate.springHibernate.Data.Entities;


import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer empleado_id;
    @Column(nullable = false) //Para que no sea null el valor nombre
    private String nombre;

    private String apellidos;
    @Column(nullable = false)
    private String dni;
    @Column(nullable = false)
    private Integer salario;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private DepartamentosModel departamento;
    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private ProyectosModel proyecto;

}
