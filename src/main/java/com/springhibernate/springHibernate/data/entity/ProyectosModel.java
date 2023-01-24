package com.springhibernate.springHibernate.data.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincremento del id
    private int idProyecto;
    @Column(nullable = false)
    private String nombre;
    private String presupuesto;
    @OneToOne
    @JoinColumn(name="idDepartamentos")
    private DepartamentosModel idDepartamentos;
}
