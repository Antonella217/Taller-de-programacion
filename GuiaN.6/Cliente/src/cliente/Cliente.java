/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

/**
 *
 * @author Antonella
 */
public class Cliente {

    private String nombre;
    private int[] productos;

    public Cliente(String nombre, int[] productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getProductos() {
        return productos;
    }
}