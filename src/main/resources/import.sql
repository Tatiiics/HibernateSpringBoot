/* . . . . DEPARTAMENTOS. . . . .*/
INSERT INTO DEPARTAMENTOS (nombre, presupuesto, gastos) VALUES ('Desarrollo',100000,20000);
INSERT INTO DEPARTAMENTOS (nombre, presupuesto) VALUES ('Marketing',50000);
INSERT INTO DEPARTAMENTOS (nombre, gastos) VALUES ('Contabilidad',12000);


/*. . . . .PROYECTOS . . . . . */
INSERT INTO PROYECTOS(nombre, presupuesto, departamento_id) VALUES ('ProyectX',2000,1)
INSERT INTO PROYECTOS(nombre, presupuesto, departamento_id) VALUES ('ProyectY',10000,1)
INSERT INTO PROYECTOS(nombre, presupuesto, departamento_id) VALUES ('ProyectMarca',40000,2)


/*. . . . .EMPLEADOS . . . . . */
INSERT INTO EMPLEADOS (nombre, apellidos, dni, salario, departamento_id, proyecto_id) VALUES ('Carlos','Cueva','71822513E', 1200,1,1);
INSERT INTO EMPLEADOS (nombre, dni, salario, departamento_id, proyecto_id) VALUES ('Maria' ,'76122513T', 1200,3,2);
INSERT INTO EMPLEADOS (nombre,apellidos, dni, salario, departamento_id, proyecto_id) VALUES ('Silvia' ,'Garcia','58225139M', 1800,1,2);