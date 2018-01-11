/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopaquetes;

/**
 *
 * @author quique
 */
public class Coches {

    private String matricula;

    public Coches(String matricula) {
        this.matricula = matricula;
    }

    public Coches() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula = " + matricula;
    }

}
