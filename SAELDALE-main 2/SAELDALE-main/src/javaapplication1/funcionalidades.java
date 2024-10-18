/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author E104
 */
public class funcionalidades {
     
    private  int opocion ;
    
    
    public void elgir (int opcion ){
        this.opocion = opcion ;
        
        if(opcion < 0  || opcion > 3){
            System.out.print("la opocion no existe");
        }
    }
    public void leer() {
    }
}
