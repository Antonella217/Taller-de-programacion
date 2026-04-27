/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author Antonella
 */
public class Cajera extends Thread {

    private String nombre;
    private Cliente[] clientes;

    public Cajera(String nombre, Cliente[] clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void run() {

        System.out.println("La cajera " + nombre + " comienza a atender.\n");

        for (Cliente cliente : clientes) {
            procesarCompra(cliente);
        }

        System.out.println("La cajera " + nombre + " ha terminado de atender a todos los clientes.");
    }

    public void procesarCompra(Cliente cliente) {

        System.out.println("La cajera " + nombre + " empieza a cobrarle al cliente " 
                + cliente.getNombre());

        int[] productos = cliente.getProductos();

        for (int i = 0; i < productos.length; i++) {
            try {
                System.out.println("Procesando producto " + (i + 1) 
                        + " del cliente " + cliente.getNombre()
                        + ". Tiempo: " + productos[i] + " segundos");

                Thread.sleep(productos[i] * 1000);

            } catch (InterruptedException e) {
                System.out.println("El cobro fue interrumpido.");
            }
        }

        System.out.println("La cajera " + nombre + " terminó de cobrarle al cliente " 
                + cliente.getNombre());
        System.out.println("--------------------------------------------");
    }
}