/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Antonella
 */
public class Llamada implements Runnable {

    private Persona persona;
    private Telefono telefono;
    private String operador;

    public Llamada(Persona persona, Telefono telefono, String operador) {
        this.persona = persona;
        this.telefono = telefono;
        this.operador = operador;
    }

    @Override
    public void run() {
        try {
            System.out.println("Entrando llamada de: " + persona.getNombre());
            System.out.println("Numero telefonico: " + telefono.getNumero());
            System.out.println("Operador " + operador + " atendiendo la llamada...");

            Thread.sleep(3000);

            System.out.println("Llamada de " + persona.getNombre() + " finalizada por " + operador);
            System.out.println("---------------------------------------------");

        } catch (InterruptedException e) {
            System.out.println("La llamada fue interrumpida.");
        }
    }
}