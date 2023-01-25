package com.springhibernate.springHibernate.Dtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DepartamentosDto {
    private int codigo;
    private String nombre;
    private int presupuesto;
    private int gastos;
}
