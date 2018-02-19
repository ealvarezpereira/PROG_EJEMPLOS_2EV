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
public class LeerNumeros {

    Scanner sc;
    private int num = 0;
    private int pares;

    public void leerNumeros() {

        File fich = new File("tercero.txt");

        try {
            sc = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc.close();

    }

    public void sumaPares() {

        File fich = new File("tercero.txt");

        try {
            sc = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (sc.hasNextInt()) {
                pares = sc.nextInt();

                if (pares % 2 == 0) {
                    num += pares;
                }

            }
            System.out.println(num);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc.close();

    }
}
