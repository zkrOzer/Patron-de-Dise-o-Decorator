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
public class Alinea extends Decorador {

    private char alinear;
    private char tipo;

    public Alinea(Texto tex, char ta, char tb) {
        super(tex);
        alinear = ta;
        tipo = tb;
        texto = super.getTexto();
    }

    public char getAlinear() {
        return alinear;
    }

    public void setAlinear(char alinear) {
        this.alinear = alinear;
    }

    @Override
    public void setTexto(String t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTexto() {
        
        int tamañoRenglon = 80;
        int numeroEspacios = 0;
        String t = new String();
        String aux = "";
        String saltolinea = "\n";
        String[] palabrasA = texto.split("\n");

        if (alinear == 'C' || alinear == 'c') {

            for (int i = 0; i < palabrasA.length; i++) {
                
                String palabraactual = palabrasA[i];
                
                numeroEspacios = (tamañoRenglon - palabraactual.length()) / 2;

                for (int p = 0; p < numeroEspacios; p++) {
                    t += " ";
                }

                if (tipo == 'i' || tipo == 'I') {
                    
                    aux += palabraactual + t + saltolinea;

                }
                if (tipo == 'd' || tipo == 'D') {
                    t = t + palabraactual + saltolinea;

                }
            }

        }

        return aux + t;
    }

}
