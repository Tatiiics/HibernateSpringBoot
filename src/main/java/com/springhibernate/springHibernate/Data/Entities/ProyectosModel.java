package com.springhibernate.springHibernate.Data.Entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Proyectos")
public class ProyectosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer proyecto_id;
    @Column(nullable = false)
    private String nombre;
    private String presupuesto;
    @OneToOne
    @JoinColumn(name="departamento_id")
    private DepartamentosModel departamento;
}
