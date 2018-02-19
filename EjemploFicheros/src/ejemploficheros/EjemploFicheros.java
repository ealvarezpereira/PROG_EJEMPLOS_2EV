/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import com.quique.escritura.EscribirFicheros;
//import com.quique.lectura.LeerFichero;
//import com.quique.lectura.LeerNumeros;
//import com.quique.lectura.LeerObjetos;
//import com.quique.lectura.LeerPalabras;
//import com.quique.personas.Alumno;
//import java.util.ArrayList;

/**
 *
 * @author quique
 */
public class EjemploFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//      ArrayList<Alumno>suspensos = new ArrayList<Alumno>();
//      LeerFichero leer = new LeerFichero();
//      LeerPalabras pal = new LeerPalabras();
//      LeerNumeros num = new LeerNumeros();
//      LeerObjetos obj = new LeerObjetos();
      EscribirFicheros escr = new EscribirFicheros();
//      leer.leerLineas();
//      pal.leerPalabras();
//      num.leerNumeros();
//      num.sumaPares();
//      obj.leerObjetos();
//      System.out.println(obj.numeroSuspensos(suspensos));
      escr.escribirFrases();
    }
    
}
