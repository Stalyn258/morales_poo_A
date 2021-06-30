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
public class Biblioteca {
    int tamanio;
     int aforo;
     Libro libro;
   String direccion;

    public Biblioteca() {
    }

    public Biblioteca(int tamanio, int aforo, Libro libro, String direccion) {
        this.tamanio = tamanio;
        this.aforo = aforo;
        this.libro = libro;
        this.direccion = direccion;
    }

    public Biblioteca(int i, float f, int i0, Libro l1, String cayambe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
