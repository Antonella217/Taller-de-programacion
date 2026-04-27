/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Antonella
 */
public class CallCenter {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Carlos");
        Persona persona3 = new Persona("Maria");
        Persona persona4 = new Persona("Luis");

        Telefono telefono1 = new Telefono("3001234567");
        Telefono telefono2 = new Telefono("3109876543");
        Telefono telefono3 = new Telefono("3205557788");
        Telefono telefono4 = new Telefono("3152223344");

        Llamada llamada1 = new Llamada(persona1, telefono1, "Operador 1");
        Llamada llamada2 = new Llamada(persona2, telefono2, "Operador 2");
        Llamada llamada3 = new Llamada(persona3, telefono3, "Operador 3");
        Llamada llamada4 = new Llamada(persona4, telefono4, "Operador 4");

        Thread hilo1 = new Thread(llamada1);
        Thread hilo2 = new Thread(llamada2);
        Thread hilo3 = new Thread(llamada3);
        Thread hilo4 = new Thread(llamada4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}