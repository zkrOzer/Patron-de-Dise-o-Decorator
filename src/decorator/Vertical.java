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
public class Vertical extends Decorador{
    private char vertical;
    
    public Vertical(Texto tex, char va){
        super(tex);
        vertical = va;
        texto = super.getTexto();
        
    }

    @Override
    public void setTexto(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getTexto() {
        String [] palabras;
        palabras = texto.split(" ");
        String t = "";
        if(vertical == 'V' || vertical == 'v'){                  
             for(int i = 0 ; i < palabras.length ; i++){             
                 t += palabras[i]+"\n";
             }     
        }
        return t;
    }
}
