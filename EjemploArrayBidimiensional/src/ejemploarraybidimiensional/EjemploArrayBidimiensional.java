/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraybidimiensional;


/**
 *
 * @author quique
 */
public class EjemploArrayBidimiensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas objNotas = new Notas();

        objNotas.crearTablaNotas();
        //5objNotas.mostrarNotas();
        //objNotas.mediaAlumon();
        objNotas.mediaDigimon();
        //objNotas.mediaModulo();
//        System.out.println("\n\n");
//        objNotas.ordenar();
//        objNotas.mostrarNotas();
//
//
//        objNotas.mediaDigimon();
//        objNotas.mediaAlumon();

        objNotas.mostrarTudo();

    }

}

