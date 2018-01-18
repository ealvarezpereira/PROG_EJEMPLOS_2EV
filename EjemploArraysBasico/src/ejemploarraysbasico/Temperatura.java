/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysbasico;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Temperatura {

    private int t;
    private boolean o = false;
    private int j = 0;

    public void mostrarArray(float[] temp) {

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Temperatura " + (i + 1) + " ---> " + temp[i]);
        }
    }

    public void mostrarTemperatura(float[] temp) {
        t = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un día determinado"));

        //Validar la 
        while (t < 1 || t > temp.length) {
            t = Integer.parseInt(JOptionPane.showInputDialog("Numero invalido."));
        }
        t = t - 1;
        System.out.println("\nTemperatura " + (t + 1) + " ---> " + temp[t]);
    }

    public void buscarElemento(float[] temp) {

        //Si esta decir que posicion ocupa, y si no decir que no está en la lista.
        float ptemp = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura"));

        for (int i = 0; i < temp.length; i++) {
            if (ptemp == temp[i]) {
                System.out.println("La temperatura fue el día " + (i + 1));
                o = true;

                break;
            }
        }

        if (o == false) {
            System.out.println("No hizo esa temperatura ningún día ");
        }

    }


    public void ordenar(float[] tem) {
        int i, j;
        float aux;
        for (i = 0; i < tem.length - 1; i++) {
            for (j = i + 1; j < tem.length; j++) {
                if (tem[i] > tem[j]) {
                    aux = tem[i];
                    tem[i] = tem[j];
                    tem[j] = aux;
                }
            }
            
        }

    }

} 
