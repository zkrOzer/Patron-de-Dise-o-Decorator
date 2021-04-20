/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author krOzer
 */
public class TextoC extends Texto{

    @Override
    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String t) {
        texto = t;
    }
    
    
}
