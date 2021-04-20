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
public class PruebaDecorador {
    
    public static void main(String[] args) {
        Texto textob = new TextoC();
        
        textob.setTexto("Ejemplo de Decorador");
        //System.out.println("Texto -> " + textob.getTexto());
        /*
        Alinear ta = new Alinear(textob);
        ta.setAlinear('C');
        System.out.println(ta.getTexto());
        */

        /*
        System.out.println("Texto alineado a la Derecha");
        Texto td = new Alinea(textob, 'C', 'D');
        System.out.println(td.getTexto());
        */
        
        /*
        System.out.println("Texto alineado a la Izquierda");
        Texto ti = new Alinea(textob, 'C', 'I');
        System.out.println(ti.getTexto());
        */
       
        /*
        System.out.println("Texto en Vertical");
        Texto textov = new TextoC();
        textov.setTexto("entre los individuos como entre las naciones");
        Texto ti = new Vertical(textov, 'V');
        System.out.println(ti.getTexto());
        */
        
        /*
        Texto textoj = new TextoC();
        System.out.println("Texto Justificado");
        textoj.setTexto("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        Texto ta = new Justificar(textoj, 'J');
        System.out.println(ta.getTexto());
        */
        
        /*
        System.out.println("Texto en Vertical y Alineado I o D");
        Texto textov = new TextoC();
        textov.setTexto("Ejemplo de Decorador");
        
        
        Texto ti = new Vertical(textov, 'V');
        Texto t2 = new Alinea(ti, 'C', 'I');
        System.out.println(t2.getTexto());
        */
       
        
                
}
}
