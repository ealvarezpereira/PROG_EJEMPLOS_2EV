/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

/**
 *
 * @author quique
 */
public class EjemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Poligonos pol = new Poligonos(4f,5f); No se puede instanciar un objeto de una clase abstracta
        Triangulo tri = new Triangulo(4f,5f);
        Rectangulo rec = new Rectangulo(4f,5f);
        Poligonos obj = new Rectangulo(3f,4f); //Si que deja porque es un rectangulo de tipo poligono
        
        tri.hallarArea();
        rec.hallarArea();
    }
    
}
