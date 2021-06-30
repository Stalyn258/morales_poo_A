/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author smora
 */
public class Punto {
    private int x;
    private int y;
    
    //constructor por defecto
    public Punto(){
        this.x=0;
        this.y=0;
        System.out.println("objeto creado");
    }
    // contructor por parametros

    public Punto(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
   
}
