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
public abstract class Decorador extends Texto{
    
    protected Texto iTexto;
    
    public Decorador(Texto t){
        iTexto = t;
    }
    
    @Override
    public String getTexto(){
        return iTexto.getTexto();
    }
    
    
    
}
