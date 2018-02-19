/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author quique
 */
public class LeerPalabras {
    
    Scanner sc;
    
    public void leerPalabras(){
    
        File fich2 = new File("segundo.txt");        
        
         try {
            sc = new Scanner(fich2).useDelimiter("\\s*,\\s*"); //Lee el fichero con el delimitador que nosotros le metemos
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
             
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc.close();
    
    }
}
