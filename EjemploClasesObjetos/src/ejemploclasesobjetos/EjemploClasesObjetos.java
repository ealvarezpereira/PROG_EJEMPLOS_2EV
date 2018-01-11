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
public class EjemploClasesObjetos {

    /**
     * @param args the command line arguments
     */
    
    //Ordenador 1 de velocidad 2000, memoria 1000, marca Philips, pulgadas 15.5, tipo con cable
    //Ordenador 2 de velocidad 2500, memoria 2000, marca Samsung, pulgadas 17.2, tipo sin cable
    public static void main(String[] args) {
        
        Cpu c = new Cpu(2000,1000);
        
        Pantalla p = new Pantalla("Philips",15.5F);
        
        Raton r = new Raton("Con Cable",new Mouse("Mauser1"));
        
        Ordenador ordenador1 = new Ordenador(c,p,r);
        
        System.out.println(ordenador1.toString());
        
        Ordenador ordenador2 = new Ordenador(new Cpu(2500,2000),new Pantalla("Samsung",17.2F),new Raton("Sin Cable",new Mouse("Mauser2")));
        
        System.out.println("\n"+ordenador2.toString());
        
        //c.setVelocidad(5000);
        //System.out.println("\n"+ordenador1.toString());
        
        //Cambiarle la velocidad al cpu del ordenador 1
        //Asi se entra en el procesador (en plan se recibe) y con el otro punto le metes la velocidad. Wao.
        ordenador1.getProcesador().setVelocidad(5000);
        System.out.println("\n"+ordenador1.toString());
        
        
        //Visualizar la marca de la pantalla del segundo ordenador
        System.out.println("\n"+ordenador2.getPantaia().getMarca());
        
        //Creamos un ordenador3 con el constructor por defecto, visualizamos los valores y luego a ese ordenador3
        //Unos valores  velocidad 3000, memoria 1500, marca asus, pulgadas 13.2, tipo sin cables
        
        Ordenador ordenador3 = new Ordenador();
        System.out.println("\n"+ordenador3.toString());
        
        //ordenador3.setProcesador(new Cpu(3000,1500));
        ordenador3.getProcesador().setVelocidad(3000);
        ordenador3.getProcesador().setMemoria(1500);
        
        //ordenador3.setPantaia(new Pantalla("Asus",13.2F));
        ordenador3.getPantaia().setMarca("Asus");
        ordenador3.getPantaia().setPulgadas(13.2f);
        
        //ordenador3.setRatita(new Raton("Sin cables"));
        ordenador3.getRatita().setTipo("Sin cables");
        
        System.out.println("\n"+ordenador3.toString());
        
        
        Ordenador ordenador4 = new Ordenador();
        ordenador4.getRatita().getMausing().setMaus("Mauser3");
        ordenador4.toString();
    }
    
}
