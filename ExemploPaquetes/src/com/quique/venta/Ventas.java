/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.venta;

import exemplopaquetes.Coches;

/**
 *
 * @author quique
 */
public class Ventas {
    
    private Coches coche;
    private int precio;
    private String marca;

    public Ventas() {
    }

    public Ventas(Coches coche, int precio, String marca) {
        this.coche = coche;
        this.precio = precio;
        this.marca = marca;
    }

    public Coches getCoche() {
        return coche;
    }

    public void setCoche(Coches coche) {
        this.coche = coche;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche: " + coche + ", Precio: " + precio + ", Marca: " + marca;
    }
    
    
}
