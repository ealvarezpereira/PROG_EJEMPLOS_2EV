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
public class LeerFichero {

    Scanner sc, sc2;

    public void leerLineas() {
        File fich = new File("C:\\Users\\quique\\Desktop\\primero.txt");
        File fich2 = new File("segundo.txt");        
        
        try {
            sc = new Scanner(fich);
            sc2 = new Scanner(fich2);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            
             while (sc2.hasNextLine()) {
                System.out.println(sc2.nextLine());
            }
             
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc2.close();
        sc.close();

    }
}
