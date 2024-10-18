/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author E104
 */
public class Menu_inicializacion {
   
    private int opcion ;
    
    
    public  Menu_inicializacion(){
        opcion = 0;
           
    }
    
    public void mostrarmenu(int opcion){
        System.out.print("Bienvenido a 'saeldale' ");
        System.out.print(" usted va hacer : "  +  "1: sing up  2: sing in 3: salir ");
        this.opcion = opcion ;
    }


    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
    
    
}


 