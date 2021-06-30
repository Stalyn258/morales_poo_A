/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Punto;

/**
 *
 * @author smora
 */
public class Aplicacion {
      public static void main(String[] args) {
          Punto p1=new Punto(-4,7);
          Punto p=new Punto();
          Bicicleta b1=new Bicicleta();
          Bicicleta b2=new Bicicleta(15, "shimano", 524,37, 55, "rojo");
          Autor au1=new Autor("155754487", "stalyn", "morales", "ing", "06/06/1998");
          Libro l1=new Libro("la belleza en poo", "int");
          Biblioteca biblio=new Biblioteca(34,0f, 55, l1, "cayambe");
          
          System.out.println("cordenadas  x del punto "+p1.getX());
          System.out.println("cordenadas del puntoy "+p1.getY());
          System.out.println(l1.getAutor()+"el autor libro 1"+l1.getTitulo());
      }
      
}
