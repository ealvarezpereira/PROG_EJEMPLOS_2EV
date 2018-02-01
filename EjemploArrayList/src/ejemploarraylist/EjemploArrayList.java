/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class EjemploArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        ArrayList lista = new ArrayList();
//
//        lista.add(1);
//        lista.add("Hola");
//        lista.add(1.6);
//        lista.add("d");
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//
//        }
//
//        for (Object obj : lista) {
//            System.out.println("lista " + obj);
//        }
        ArrayList<Integer> listanumm = new ArrayList();

        ArrayList<Integer> pares = new ArrayList();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("0.- Salir\n1.- Añadir dato\n2.- Mostrar lista\n3.- Borrar Posicion\n4.- Borrar elemento"
                + "\n5.- Modificar elemento posicion\n6.- Modificar elemento valor\n7.- Mayor y menor\n8.- Pares\n10.- ( ͡° ͜ʖ ͡°)"));

        //listanumm.add(new Integer(3));
        Metodos objMetodos = new Metodos();
        // No admite string listanumm.add("a");
        
        while (op != 0) {
            switch (op) {

                case 1:
                    objMetodos.añadir(listanumm);
                    //listanumm.add(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero")));
                    break;

                case 2:
                    System.out.println(listanumm);
                    break;

                case 3:
                    objMetodos.borrarElementoPosicion(listanumm);
                    break;

                case 4:
                    objMetodos.borrarElemento(listanumm);
                    break;
                    
                case 5:
                    objMetodos.modificarElementoPosicion(listanumm);
                    break;
                    
                    
                case 6: 
                    objMetodos.modificarElemento(listanumm);
                    break;

                    
                case 7: //Para llamar a los metodos se pone el nombre de la clase
                    objMetodos.menorMayor(listanumm);
                    System.out.println("Mayor: "+Metodos.iNumeroMayor+", Menor: "+Metodos.iNumeroMenor);
                            
                    
                    break;
                    
                case 8:
                    System.out.println(objMetodos.pares(listanumm, pares));
                    break;
                    
                    
                case 10:
                    System.out.println("       ______\n"
                            + "  .---<__. \\ \\\n"
                            + "  `---._  \\ \\ \\\n"
                            + "   ,----`- `.))         \n"
                            + "  / ,--.   )  |\n"
                            + " /_/    >     |\n"
                            + " |,\\__-'      |\n"
                            + "  \\_           \\\n"
                            + "    ~~-___      )\n"
                            + "          \\      \\");
                    break;
                   
                    
                
                default:
                    System.out.println("Valor inválido");
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("0.- Salir\n1.- Añadir dato\n2.- Mostrar lista\n3.- Borrar Posicion\n4.- Borrar elemento"
                    + "\n5.- Modificar elemento posicion\n6.- Modificar elemento valor\n7.- Mayor y menor\n8.- Pares\n10.- ( ͡° ͜ʖ ͡°)"));
        }
    }
}
