package com.springhibernate.springHibernate.Dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProyectosDto {

    private Integer idProyecto;
    private String nombre;
    private String presupuesto;
    private Integer idDepartamentos;
}
