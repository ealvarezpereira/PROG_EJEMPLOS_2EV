/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class MetodosArray {

    public void mostrar(Persona[] listaPersonas) {

        for (Persona element : listaPersonas) {
            System.out.println(element);
        }

    }

    public Persona[] crearArray() {
        Persona[] pers = new Persona[4];
        for (int i = 0; i < pers.length; i++) {

            String nombre = JOptionPane.showInputDialog("Nombre:");
            String dni = JOptionPane.showInputDialog("DNI:");

            pers[i] = new Persona(nombre, dni);

        }
        return pers;
    }
    private boolean encontrado = false;

    Persona per = new Persona();

    public Persona buscar(Persona[] liPers, String dni) {
        dni = JOptionPane.showInputDialog("Introduzca el DNI de la persona que quiere buscar");
        for (int i = 0; i < liPers.length; i++) {
            if (liPers[i].getDni().equalsIgnoreCase(dni)) {
                encontrado = true;
                per = liPers[i];
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("No se ha encontrado la persona ");
        }
        return per;
    }

}
