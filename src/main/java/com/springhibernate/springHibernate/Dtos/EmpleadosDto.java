package com.springhibernate.springHibernate.Dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmpleadosDto {

    private Integer id_empleado;
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer salario;
    private Integer idDepartamentosSSS;
    private Integer idProyectos;
}
