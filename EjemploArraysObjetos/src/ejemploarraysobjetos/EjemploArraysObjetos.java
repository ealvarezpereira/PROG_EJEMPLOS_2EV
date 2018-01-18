/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysobjetos;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class EjemploArraysObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        String nombre, dni;
        MetodosArray objMet = new MetodosArray();
//        for(int i = 0; i<personas.length;i++){
//            nombre=JOptionPane.showInputDialog("Nombre:");
//            dni = JOptionPane.showInputDialog("DNI:");
//            personas[i]= new Persona(nombre,dni);
//        }
        //Persona[]lista = {new Persona("aa","11"),new Persona("bb","22")};
        //objMet.mostrar(lista);
        
        personas = objMet.crearArray();
        //objMet.mostrar(personas);
        
        //System.out.println(objMet.buscar(personas,"11"));
        
        //Ordenar
        
        Arrays.sort(personas);
        objMet.mostrar(personas);
    }
    
}
