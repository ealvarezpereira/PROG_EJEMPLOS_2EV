/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.taller;

import com.quique.venta.Ventas;
import exemplopaquetes.Coches;

/**
 *
 * @author quique
 */
public class Taller {

    private Coches matricula;
    private float factura;

    public Taller(Coches matricula, float factura) {
        this.matricula = matricula;
        this.factura = factura;
    }

    public Taller() {
    }

    public Coches getMatricula() {
        return matricula;
    }

    public void setMatricula(Coches matricula) {
        this.matricula = matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setFactura(float factura) {
        this.factura = factura;
    }
    
   
    
    
    public void costeArreglo(String matricula,Ventas colle1){
    
        float descuento;
        
        if (matricula == colle1.getCoche().getMatricula()){
        
            descuento = factura - (factura*0.20F);
            System.out.println("Factura con descuento: "+descuento);
            
        } else {
            descuento = factura;
            System.out.println("Factura sin descuento: "+descuento);
        }
        
    
    }
    
    

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Factura: " + factura;
    }

}
