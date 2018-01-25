/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraybidimiensional;

import datos.PedirDatos;

/**
 *
 * @author quique
 */
public class Notas {

    int[][] notas = new int[4][3];
    String[] nombres = {"aa   ", "bb   ", "cc   ", "dd   "};
    String[] modulos = {"   PRO", "BD", "CD", "MEDIA"};
    int[] medias = new int[notas.length];
    int acumulador = 0;
    int[] mediasModulos = new int[notas.length];

    public void crearTablaNotas() {

        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = PedirDatos.readInt();
            }
        }

    }

    public void mostrarNotas() {

        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + "    ");
            }
            System.out.println("\n");
        }

    }

    //Como un digimon
    public void mediaAlumon() {

        acumulador = 0;
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                acumulador = acumulador + notas[f][c];
                System.out.print(notas[f][c] + "    ");
            }
            System.out.print("Media: " + acumulador);
            acumulador = 0;
            System.out.println("\n");
        }

    }

    //Y aqui esta el digimon
    public int[] mediaDigimon() {

        int acumulador;
        for (int f = 0; f < notas.length; f++) {
            acumulador = 0;
            for (int c = 0; c < notas[f].length; c++) {

                acumulador = acumulador + notas[f][c];

            }
            medias[f] = acumulador / notas[f].length;
        }
        return medias;
    }

    public int[] mediaModulo() {

        int acumulador;
        int f, c;
        
        for (c = 0; c < notas[0].length; c++) {
            acumulador = 0;
            for (f = 0; f < notas.length; f++) {
                acumulador = acumulador + notas[f][c];
            }
            mediasModulos[c] = acumulador / notas.length;

            System.out.print(mediasModulos[c] + "    ");
        }
        
        return mediasModulos;

    }

    public void ordenar() {
        int i, j, k, aux1 = 0, aux2 = 0;

        for (i = 0; i < medias.length; i++) {
            for (j = i + 1; j < medias.length; j++) {

                if (medias[i] > medias[j]) {
                    aux1 = medias[i];
                    medias[i] = medias[j];
                    medias[j] = aux1;
                    for (k = 0; k < notas[0].length; k++) {
                        aux2 = notas[i][k];
                        notas[i][k] = notas[j][k];
                        notas[j][k] = aux2;
                    }

                }
            }

        }
    }

    
    public void mostrarTudo() {

        for (int i = 0; i < modulos.length; i++) {
            System.out.print(modulos[i] + "    ");
        }
        
        System.out.println("\n");
        for (int f = 0; f < notas.length; f++) {
  
            System.out.print(nombres[f]);
            for (int c = 0; c < notas[f].length; c++) {

                System.out.print(notas[f][c] + "    ");

            }
            System.out.println("   "+medias[f]);
            System.out.println("\n");
        }

    }

}
