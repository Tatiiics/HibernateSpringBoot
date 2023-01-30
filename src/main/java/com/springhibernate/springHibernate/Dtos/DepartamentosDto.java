package com.springhibernate.springHibernate.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DepartamentosDto {

    private Integer codigo;
    private String nombre;
    private Integer presupuesto;
    private Integer gastos;
}
