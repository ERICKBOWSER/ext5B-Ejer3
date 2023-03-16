/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ej3;

import java.util.List;

/**
 *
 * @author ERICK
 */
public class PruebaCoro {
    public static void main(String[] args) {
        Coro coro1 = new Coro();
        
        // A
        List<Voz> listaObtenida = coro1.generarVoces(20);
        
        System.out.println(listaObtenida);
        
        
        // C
        List<Voz> listaMasRepetida = coro1.buscarVozMasRepetida(listaObtenida);
        
        System.out.println(listaMasRepetida);
        
    }
}
