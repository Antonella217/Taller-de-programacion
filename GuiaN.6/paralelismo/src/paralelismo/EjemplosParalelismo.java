/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paralelismo;

/**
 *
 * @author Antonella
 */


    /**
     * @param args the command line arguments
     */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EjemplosParalelismo {

    public static void main(String[] args) throws Exception {
        ejemploParalelismoDatos();
        ejemploParalelismoTareas();
    }

    // Ejemplo 1: Paralelismo de datos
    public static void ejemploParalelismoDatos() {
        List<Integer> datos = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> cuadrados = datos
                .parallelStream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("=== Paralelismo de datos ===");
        System.out.println("Datos originales: " + datos);
        System.out.println("Cuadrados: " + cuadrados);
    }

    // Ejemplo 2: Paralelismo de tareas
    public static void ejemploParalelismoTareas() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<String> tarea1 = executor.submit(() -> "Datos descargados");
        Future<String> tarea2 = executor.submit(() -> "Imagen procesada");
        Future<String> tarea3 = executor.submit(() -> "Archivo guardado");

        System.out.println("\n=== Paralelismo de tareas ===");
        System.out.println(tarea1.get());
        System.out.println(tarea2.get());
        System.out.println(tarea3.get());

        executor.shutdown();
    }
}