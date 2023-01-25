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
public class ProyectosDto {

    private int idProyecto;
    private String nombre;
    private String presupuesto;
    private int idDepartamentos;
}
