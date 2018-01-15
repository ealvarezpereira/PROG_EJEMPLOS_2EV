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
public class Rectangulo extends Poligonos{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void hallarArea() {
        System.out.println("Area rectangulo= "+this.getBase()*this.getAltura());
    }
    
}
