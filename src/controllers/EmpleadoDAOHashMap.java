package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap(){
         empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
        System.out.println("Empleado agregado: " + empleado);
    }

    @Override
    public void eliminarEmpleado(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
        System.out.println("Empleado con ID " + temp + " eliminado.");
    }

    @Override
    public void listarEmpleados() {
        System.out.println("\n----------Lista de Empleados----------");
        for (Map.Entry<Empleado, Empleado> entry : empleados.entrySet()) {
            System.out.println("ID: " + entry.getKey().getId() + ", Empleado: " + entry.getValue());
        }

    }
}
