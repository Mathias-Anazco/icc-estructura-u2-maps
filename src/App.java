import controllers.*;

import dao.EmpleadoDAO;
import models.Empleado;

import java.lang.ref.PhantomReference;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoHashMap = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController = new EmpleadoContoller(empleadoHashMap);

        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoControllerTreeMap = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        // Agregar empleados
        empleadoController.agregarEmpleado(emp1);
        empleadoController.agregarEmpleado(emp2);
        empleadoController.agregarEmpleado(emp3);
        empleadoController.agregarEmpleado(emp4);
        empleadoController.agregarEmpleado(emp5);

        empleadoControllerTreeMap.agregarEmpleado(emp1);
        empleadoControllerTreeMap.agregarEmpleado(emp2);
        empleadoControllerTreeMap.agregarEmpleado(emp3);
        empleadoControllerTreeMap.agregarEmpleado(emp4);
        empleadoControllerTreeMap.agregarEmpleado(emp5);

        // Listar empleados
        empleadoController.listarEmpleado();
        empleadoControllerTreeMap.listarEmpleado();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();

    }


    private static void runEjerccios() {
        System.out.println("--".repeat(30));
        Ejercicios ejercicios = new Ejercicios();
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "hello";
        String str4 = "bello";
        boolean anagramResult = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿" + str1 + " y " + str2 + " son anagramas? " + anagramResult);
        boolean anagramResult2 = Ejercicios.areAnagrams(str3, str4);
        System.out.println("¿" + str3 + " y " + str4 + " son anagramas? " + anagramResult2);

        int[] numeros = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(numeros, objetivo);
        if (resultado != null) {
            System.out.println("Índices que suman " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró una combinación que sume " + objetivo);
        }

        String texto = "hola";
        System.out.println("Conteo de caracteres en " + texto + " : ");
        ejercicios.contarCaracteres(texto);

        String palabra1 = "roma";
        String palabra2 = "amor";
        boolean resultado2 = ejercicios.sonAnagramas(palabra1, palabra2);
        System.out.println("¿" + palabra1 + " y " + palabra2 + " son anagramas? " + resultado2);
    }

}
