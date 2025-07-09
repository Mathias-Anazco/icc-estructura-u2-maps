package dao;

import models.Empleado;

public interface EmpleadoDAO {

    void add(Empleado empleado);
    void eliminarEmpleado(int id);
    void listarEmpleados();
}
