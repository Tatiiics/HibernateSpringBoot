package com.springhibernate.springHibernate.Data.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Departamentos")

public class DepartamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincremento del id
    private int codigo;
    @Column(nullable = false)
    private String nombre;
    private int presupuesto;
    private int gastos;
}
