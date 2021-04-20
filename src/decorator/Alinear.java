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
public class Alinear extends Decorador{
    
    private char alinear;
    
    public Alinear(Texto textob){
        super(textob);
        texto = super.getTexto();
    }

    public char getAlinear() {
        return alinear;
    }

    public void setAlinear(char ta) {
        alinear = ta;
    }

    @Override
    public String getTexto() {
        int tamañoRenglon = 80;
        int numeroEspacios = 0;
        String t = new String();
        if(alinear == 'C' || alinear == 'c'){
            numeroEspacios = (tamañoRenglon - texto.length())/2;
        for(int p = 0 ; p < numeroEspacios ; p++)
                t+=" ";  
        }
            return t+texto;       
    }

    @Override
    public void setTexto(String t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
}
