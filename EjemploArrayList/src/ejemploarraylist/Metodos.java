/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Metodos {

    static int iNumeroMayor;
    static int iNumeroMenor;

    public void añadir(ArrayList<Integer> lis) {
        Integer n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        lis.add(n);
    }

    public void mostrarItertor(ArrayList<Integer> u) {
        Iterator it = u.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    //metodo para borrar un elemento que esté en una posicion
    public void borrarElementoPosicion(ArrayList<Integer> borrar) {
        borrar.remove(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion que quieres borrar")) - 1);
    }

    public void borrarElemento(ArrayList<Integer> borrar) {
        int aa = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor que quiere borrar"));
        for (int i = 0; i < borrar.size(); i++) {
            if (aa == borrar.get(i)) {
                borrar.remove(i);
            }
        }
    }

//    public void borrarElemento2(ArrayList<Integer> borrar) {
//        int aa = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor que quiere borrar"));
//        borrar.remove(new Integer(aa));
//    }

    public void modificarElementoPosicion(ArrayList<Integer> modificar) {
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la posicion que quieres borrar"));
        pos = pos - 1;
        int val = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor"));
        modificar.set(pos, val);

    }

    public void modificarElemento(ArrayList<Integer> modificar) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor que quieres modificar"));
        int nval = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor"));
        for (int i = 0; i < modificar.size(); i++) {
            if (val == modificar.get(i)) {
                modificar.set(i, nval);
            }
        }
    }

//    public void modificarElemento2(ArrayList<Integer> modificar) {
//        int val = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor que quieres modificar"));
//        int nval = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nuevo valor"));
//        int pos = modificar.indexOf(new Integer(val));
//        modificar.set(pos, val);
//    }

    public int getiNumeroMayor() {
        return iNumeroMayor;
    }

    public int getiNumeroMenor() {
        return iNumeroMenor;
    }

    public void menorMayor(ArrayList<Integer> mayme) {
        iNumeroMayor = mayme.get(0);
        iNumeroMenor = mayme.get(0);
        for (int i = 0; i < mayme.size(); i++) {
            if (mayme.get(i) > iNumeroMayor) {
                iNumeroMayor = mayme.get(i);
            }
            if (mayme.get(i) < iNumeroMenor) {
                iNumeroMenor = mayme.get(i);
            }
        }

    }
    
    public ArrayList pares(ArrayList<Integer> numeros, ArrayList<Integer> pares){
    
        for (int i = 0; i < numeros.size(); i++) {
            
            if(numeros.get(i)%2 == 0){
                pares.add(numeros.get(i));
            }        
        } 
        return pares;
    }
    
}
