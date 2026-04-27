/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

/**
 *
 * @author Antonella
 */
public class Supermercado {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana", new int[]{2, 1, 3});
        Cliente cliente2 = new Cliente("Carlos", new int[]{1, 2, 2, 1});
        Cliente cliente3 = new Cliente("Maria", new int[]{3, 2});

        Cliente[] clientes = {cliente1, cliente2, cliente3};

        Cajera cajera1 = new Cajera("Martha", clientes);

        cajera1.start();
    }
}