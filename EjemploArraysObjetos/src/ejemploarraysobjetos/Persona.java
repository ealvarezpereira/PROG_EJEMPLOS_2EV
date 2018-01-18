/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraysobjetos;

/**
 *
 * @author quique
 */
public class Persona implements Comparable {

    private String nombre, dni;

    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni;
    }

    @Override
    public int compareTo(Object t) {

        Persona p = (Persona) t;
        if (dni.compareToIgnoreCase(p.dni) > 0) {
            return 1;
        } else if (dni.compareToIgnoreCase(p.dni) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}
