/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.EntidadesPelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList listadepeliculas = new ArrayList<>();

    public EntidadesPelicula crearpelicula() {
        EntidadesPelicula peli = new EntidadesPelicula();
        System.out.println("Ingrese el título de la película");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el director/a de la película");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película");
        peli.setDuracion(leer.nextDouble());

        return new EntidadesPelicula(peli.getTitulo(), peli.getDirector(), peli.getDuracion());
    }

    public void agregarPelicula(EntidadesPelicula p1) {
        listadepeliculas.add(p1);
    }

    public void fabricadePeliculas() {
        String resp;
        do {
            EntidadesPelicula nuevapeli = crearpelicula();
            agregarPelicula(nuevapeli);
            System.out.println("Desea agregar nueva película?");
            resp = leer.next();
        } while (resp.equals("si"));
    }

    public void mostrarPeliculas() {
        System.out.println("La películas de la lista son: ");
        for (Object aux : listadepeliculas) {
            System.out.println(aux);
        }
    }

    public void mayorDuracion() {
        ArrayList listaPelisLargas = new ArrayList<>();
        System.out.println("Las películas que duran más de una hora son:");
        for (int i = 0; i < listadepeliculas.size(); i++) {
            if (.getDuracion() > 1) {
                listaPelisLargas.add();
            }

        }
    }

}
