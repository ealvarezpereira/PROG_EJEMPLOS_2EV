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
public abstract class Poligonos {
    private float base;
    private float altura;

    public Poligonos(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    public abstract void hallarArea();
}
