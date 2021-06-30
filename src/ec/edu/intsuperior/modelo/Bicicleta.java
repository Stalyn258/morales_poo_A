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
public class Bicicleta {
   int numeroRing;
  String  marca;
   double  precio;
   int tamanio;
   String color;

    public Bicicleta() {
    }

    public Bicicleta(int numeroRing, String marca, double precio, int tamanio, String color) {
        this.numeroRing = numeroRing;
        this.marca = marca;
        this.precio = precio;
        this.tamanio = tamanio;
        this.color = color;
    }

    public Bicicleta(int i, String shimano, int i0, int i1, int i2, String rojo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
