/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ERICK
 */
public class Coro {

    private int num;

    public Coro() {
    }

//    public Coro(int num) {
//        try{
//            this.num = num;
//        }catch(IllegalArgumentException iae){
//            System.out.println("Dato erroneo");
//        }
//                
//    }  
      

    public List<Voz> generarVoces(int num){
        
        List<Voz> listaVoces = new ArrayList();
                        
        for (int i = 0; i <= num; i++) {
            
            int numero = (int)(Math.random()*6+1);
            
            if(numero == 1){
                listaVoces.add(Voz.CONTRATENOR);
            }else if(numero == 2){
                listaVoces.add(Voz.TENOR);
            }else if(numero == 3){
                listaVoces.add(Voz.BARITONO);
            }else if(numero == 4){
                listaVoces.add(Voz.SOPRANO);
            }else if(numero == 5){
                listaVoces.add(Voz.MEZZOSOPRANO);
            }else{
                listaVoces.add(Voz.CONTRALTO);
            }
        }
        
        return listaVoces;
    }


//    public int getNumeroCorosMixtos(List<Voz> voces){
//        
//        int contBaritono = 0;
//        
//        
//        
//        for (Voz voz1 : voces) {
//            if(voz1.equals(Voz.BARITONO)){
//                
//            }
//        }
//    }


    public List<Voz> buscarVozMasRepetida(List<Voz> voces){
        
        int contContratenor = 0;
        int contTenor = 0;
        int contBaritono = 0;
        int contSoprano = 0;
        int contMezzosoprano = 0;
        int contContralto = 0;
        
        List<Voz> listaMasBuscados = new ArrayList();
        
        for (Voz voce : voces) {
            if(voce.equals(Voz.BARITONO)){
                contBaritono++;
            }else if(voce.equals(Voz.CONTRALTO)){
                contContralto++;
            }else if(voce.equals(Voz.CONTRATENOR)){
                contContratenor++;
            }else if(voce.equals(Voz.MEZZOSOPRANO)){
                contMezzosoprano++;
            }else if(voce.equals(Voz.SOPRANO)){
                contSoprano++;
            }else{
                contTenor++;
            }
        }
        
        if(contBaritono >= contContralto && 
                contBaritono >= contContratenor && 
                contBaritono >= contMezzosoprano &&
                contBaritono >= contSoprano && 
                contBaritono >= contTenor){
            
            listaMasBuscados.add(Voz.BARITONO);
            
        }
        
        if(contContralto >= contBaritono && 
                contContralto >= contContratenor && 
                contContralto >= contMezzosoprano && 
                contContralto >= contSoprano && 
                contContralto >= contTenor){
            
            listaMasBuscados.add(Voz.CONTRALTO);
            
        }
        
        if(contContratenor >= contBaritono && 
                contContratenor >= contContralto && 
                contContratenor >= contContratenor &&
                contContratenor >= contMezzosoprano &&
                contContratenor >= contSoprano &&
                contContratenor >= contTenor){
            
            listaMasBuscados.add(Voz.CONTRATENOR);
            
        }
        
        if(contMezzosoprano >= contBaritono &&
                contMezzosoprano >= contContralto &&
                contMezzosoprano >= contContratenor &&
                contMezzosoprano >= contSoprano &&
                contMezzosoprano >= contTenor){
            
            listaMasBuscados.add(Voz.MEZZOSOPRANO);
            
        }
        
        if(contSoprano >= contBaritono &&
                contSoprano >= contContralto &&
                contSoprano >= contContratenor &&
                contSoprano >= contMezzosoprano &&
                contSoprano >= contTenor){
            
            listaMasBuscados.add(Voz.SOPRANO);
            
        }
        
        if(contTenor >= contBaritono &&
                contTenor >= contContralto &&
                contTenor >= contContratenor &&
                contTenor >= contMezzosoprano &&
                contTenor >= contSoprano){
            listaMasBuscados.add(Voz.TENOR);
        }
            
        return listaMasBuscados;
        
    }







    
}
