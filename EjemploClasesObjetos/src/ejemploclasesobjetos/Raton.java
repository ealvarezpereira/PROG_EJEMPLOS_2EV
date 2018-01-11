/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

/**
 *
 * @author quique
 */
public class Raton {

    private String tipo;
    private Mouse mausing;

    public Raton() {
    }

    public Raton(String tipo, Mouse maus) {
        this.tipo = tipo;
        this.mausing = maus;
    }

    public Mouse getMausing() {
        return mausing;
    }

    public void setMausing(Mouse mausing) {
        this.mausing = mausing;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo = " + tipo + "Mouse = " + mausing;
    }

}
