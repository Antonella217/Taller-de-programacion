/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechas;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonella
 */
public class Fechas {

    public static void main(String[] args) {
        int dd = 0, mm = 0, aa = 0;
        Fecha F = new Fecha();

        do {
            dd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Dia:"));
            mm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Mes:"));

            do {
                aa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Año desde 1963:"));
            } while (aa < 1963);

            try {
                F.comprobar(dd, mm, aa);
                JOptionPane.showMessageDialog(null, "Fecha correcta");
                dd = 1;
                mm = 1;
                aa = 1;
            } catch (ExceptoFecha e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                dd = 0;
                mm = 0;
                aa = 0;
            }

        } while (dd == 0 && mm == 0 && aa == 0);

        System.exit(0);
    }
}