/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.lectura;

import com.quique.personas.Alumno;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quique
 */
public class LeerObjetos {

    Scanner sc;
    String[] lista = new String[2];
    Alumno alum;
    String linea = null;
    private int aprobados;

    public void leerObjetos() {

        try {

            sc = new Scanner(new File("alumnos.txt"));

            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                lista = linea.split(",");

                alum = new Alumno(lista[0], Integer.parseInt(lista[1]));

                System.out.println(alum);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error1" + ex.getMessage());
        }

        sc.close();

    }

    public ArrayList numeroSuspensos(ArrayList<Alumno> aAlumno) {

        try {

            sc = new Scanner(new File("alumnos.txt"));
            while (sc.hasNextLine()) {

                linea = sc.nextLine();
                //lista = new String[2];
                lista = linea.split(",");
                alum = new Alumno(lista[0], Integer.parseInt(lista[1]));

                //if(Integer.parseInt(linea)){
                //aAlumno.add(alum = new Alumno(lista[0], Integer.parseInt(lista[1])));
                //}
                
                if (alum.getNota() < 5) {
                    aAlumno.add(alum);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }
        sc.close();

        return aAlumno;
    }
}
