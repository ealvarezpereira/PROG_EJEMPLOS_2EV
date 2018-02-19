/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.escritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author quique
 */
public class EscribirFicheros {

    File fich;
    PrintWriter escribir;
    FileWriter es;

    public void escribirFrases() {

        try {
            fich = new File("frases.txt");
            escribir = new PrintWriter(new FileWriter(fich, true));
            escribir.println("Primera frase");
            escribir.println("Segunda frase");
            escribir.println("Tercera frase");

        } catch (FileNotFoundException ex) {
            System.out.println("Error de escritura" + ex);

        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex);
        } finally {
            escribir.close();
        }

    }

}
