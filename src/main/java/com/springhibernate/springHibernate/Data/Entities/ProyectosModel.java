package com.springhibernate.springHibernate.Data.Entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="Proyectos")
public class ProyectosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer proyecto_id;
    @Column(nullable = false)
    private String nombre;
    private Integer presupuesto;
    @OneToOne
    @JoinColumn(name="departamento_id")
    private DepartamentosModel departamento;
}
