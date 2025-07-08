package controllers;

import models.Empleado;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {
        // Crear un HashMap
        HashMap<String, String> capitales = new HashMap<>();

        // Agregar elementos al HashMap
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");

        System.out.println("----------Capitales de América del Sur----------");

        // Imprimir el HashMap
        System.out.println("Capitales: " + capitales.keySet());
        System.out.println("--".repeat(30));

        // Acceder a un elemento
        for (String pais : capitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        }
        System.out.println("--".repeat(30));

        // Ejemplo de acceso directo
        String capitalEcuador = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capitalEcuador);

        HashMap<Integer, Empleado> empleados = new HashMap<>();
        System.out.println("--".repeat(30));
        System.out.println("----------Empleados----------");
        empleados.put(3, new Empleado(3, "Pedro", "Gerente"));
        empleados.put(1, new Empleado(1, "Ana", "Desarrollador"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñadora"));
        empleados.put(1, new Empleado(3, "Pedro", "Gerente")); // Este reemplaza al anterior con id 1

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave:" + entry.getKey() + ", Valor: " + entry.getValue());
        }

        HashMap<Empleado, Integer> empleado = new HashMap<>();
        System.out.println("--".repeat(30));
        System.out.println("----------Empleados 2----------");
        Empleado emp1 = new Empleado(1, "Ana", "Desarrollador");
        Empleado emp2 = new Empleado(2, "Pedro", "Desarrollador");
        Empleado emp3 = new Empleado(3, "Ana", "Desarrollador");
        Empleado emp4 = new Empleado(3, "Ana", "Desarrollador");

        empleado.put(emp1, 1000);
        empleado.put(emp2, 1200);
        empleado.put(emp3, 1500);
        empleado.put(emp4, 1800); // Este reemplaza al anterior con id 3

        for (Map.Entry<Empleado, Integer> entry : empleado.entrySet()) {
            System.out.println("Empleado: " + entry.getKey().getName() + ", Salario: " + entry.getValue());
        }


    }

    public void ejemploConLinkedHashMap() {
        // Crear un LinkedHashMap
        HashMap<String, Integer> productos = new LinkedHashMap<>();

        // Agregar elementos al LinkedHashMap
        System.out.println("--".repeat(30));
        productos.put("Manzanas", 10);
        productos.put("Peras", 5);
        productos.put("Bananas", 8);
        productos.put("Naranjas", 12);
        productos.put("Uvas", 15);
        System.out.println("--".repeat(30));

        System.out.println("----------Productos----------");

        // Imprimir el LinkedHashMap
        System.out.println("Productos: " + productos.keySet());
        System.out.println("--".repeat(30));

        // Acceder a un elemento
        for (String producto : productos.keySet()) {
            System.out.println("Cantidad de " + producto + ": " + productos.get(producto));
        }
        System.out.println("--".repeat(30));

        // Ejemplo de acceso directo
        int cantidadManzanas = productos.get("Manzanas");
        System.out.println("Cantidad de Manzanas: " + cantidadManzanas);


    }

    public void ejemploConTreeMap() {
        HashMap<Integer, String> persona = new HashMap<>();

        System.out.println("--".repeat(30));
        persona.put( 1, "Juan Perez");
        persona.put( 2, "Ana Gomez");
        persona.put( 3, "Luis Torres");
        persona.put( 4, "Maria Lopez");
        persona.put( 5, "Carlos Sanchez");
        System.out.println("--".repeat(30));

        System.out.println("----------Personas----------");

        // Imprimir el HashMap
        System.out.println("Personas: " + persona.keySet());
        System.out.println("--".repeat(30));

        // Acceder a un elemento
        for (Integer id : persona.keySet()) {
            System.out.println("ID: " + id + ", Nombre: " + persona.get(id));
        }
        System.out.println("--".repeat(30));

        // Ejemplo de acceso directo
        String nombrePersona = persona.get(3);
        System.out.println("Nombre de la persona con ID 3: " + nombrePersona);




        Map<Empleado, Integer> empleado = new TreeMap<>();
        System.out.println("--".repeat(30));
        System.out.println("----------Empleados 2----------");
        Empleado emp1 = new Empleado(1, "Ana", "Desarrollador");
        Empleado emp2 = new Empleado(2, "Pedro", "Desarrollador");
        Empleado emp3 = new Empleado(3, "Ana", "Desarrollador");
        Empleado emp4 = new Empleado(3, "Ana", "Desarrollador");

        empleado.put(emp1, 1000);
        empleado.put(emp2, 1200);
        empleado.put(emp3, 1500);
        empleado.put(emp4, 1800); // Este reemplaza al anterior con id 3

        for (Map.Entry<Empleado, Integer> entry : empleado.entrySet()) {
            System.out.println("Empleado: " + entry.getKey().getName() + ", Salario: " + entry.getValue());
        }
    }
}
