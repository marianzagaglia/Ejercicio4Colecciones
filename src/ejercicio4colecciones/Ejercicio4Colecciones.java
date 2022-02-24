/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4colecciones;

import Entidades.EntidadesPelicula;
import Servicio.ServicioPelicula;

/**
 *
 * @author Mariana
 */
public class Ejercicio4Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula ns = new ServicioPelicula();
        ns.fabricadePeliculas();
        ns.mostrarPeliculas();
        ns.mayorDuracion();
    }
    
}
