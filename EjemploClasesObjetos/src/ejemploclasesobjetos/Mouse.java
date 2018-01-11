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
public class Mouse {
    
    private String maus;

    public Mouse() {
    }

    public Mouse(String maus) {
        this.maus = maus;
    }

    public String getMaus() {
        return maus;
    }

    public void setMaus(String maus) {
        this.maus = maus;
    }

    @Override
    public String toString() {
        return "Maus=" + maus;
    }
    
    
}
