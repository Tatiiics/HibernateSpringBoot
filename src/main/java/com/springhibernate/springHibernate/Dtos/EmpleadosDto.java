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
public class EmpleadosDto {

    private int id_empleado;
    private String nombre;
    private String apellidos;
    private String dni;
    private int salario;
    private int idDepartamentos;
    private int idProyectos;
}
