/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysbasico;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class EjemploArraysBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        float[] temperaturas = new float[7];
//        Le damos valores elemento a elemento
//        temperaturas[0] = 1.2f;
//        temperaturas[1] = 2.2f;
//        temperaturas[2] = 3.2f;
//        temperaturas[3] = 5.2f;
//        temperaturas[4] = 6.2f;
//        temperaturas[5] = 7.2f;
//        temperaturas[6] = 8.2f;
//        Inicializacion del array
//        float[]temperaturas = {3f,2f,5f,7f};


        //int []numeros = {7,4,1,3};
        //Arrays.sort(numeros);
        //objTem.ordenarNumeros(numeros);
        
        
        float[] temperaturas = new float[7];  
        
        for (int i = 0; i < temperaturas.length; i++) {

            temperaturas[i] = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura " + (i + 1)));
        }

        Temperatura objTem = new Temperatura();
        
        //objTem.mostrarArray(temperaturas);
        //objTem.mostrarTemperatura(temperaturas);
        //objTem.buscarElemento(temperaturas);

        objTem.ordenar(temperaturas);
        Arrays.sort(temperaturas);
        objTem.mostrarArray(temperaturas);
    }

}
