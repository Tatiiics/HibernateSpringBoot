package com.springhibernate.springHibernate.Data.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Departamentos")

public class DepartamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento del id
    private Integer departamento_id;
    @Column(nullable = false)
    private String nombre;
    private Integer presupuesto;
    private Integer gastos;
}
