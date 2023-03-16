/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ej3;

/**
 *
 * @author ERICK
 */
public enum Voz {
    CONTRATENOR("masculino"), TENOR("masculino"), BARITONO("masculino"), SOPRANO("femenino"), MEZZOSOPRANO("femenino"), CONTRALTO("femenino");
    
    private Voz(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    private String genero;
}
