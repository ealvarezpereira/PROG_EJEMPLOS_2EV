/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplopaquetes;

import com.quique.taller.Taller;
import com.quique.venta.Ventas;


/**
 *
 * @author quique
 */
public class ExemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Coches coche1 = new Coches("1111");
        Ventas colle1 = new Ventas(coche1,12000,"Citroen");
        Taller colle2 = new Taller(coche1,500f);
        System.out.println(colle1.toString());
        System.out.println(colle2.toString());

        
        colle2.costeArreglo("1111",colle1);
        colle2.costeArreglo("01111",colle1);
    }
    
}
