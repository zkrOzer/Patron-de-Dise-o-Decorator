/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.StringTokenizer;
/**
 *
 * @author krOzer
 */
public class Justificar extends Decorador{
    
    private char justifica;
    
    public Justificar(Texto tex, char ja){
        super(tex);
        justifica = ja;
        texto = super.getTexto();
    }

    @Override
    public void setTexto(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getTexto() {
        int tamañoRenglon = 80;
        String t = new String();
        int contador = 0;
        if(justifica == 'J' || justifica == 'j'){           
            for(int i = 0 ; i<texto.length() ; i++){
                
                    t +=texto.charAt(i);
                    contador++;
                    if(contador == tamañoRenglon){
                        t+="\n";
                        contador = 0;
                    }               
            }           
        }
            return t;       
    }
    
}
