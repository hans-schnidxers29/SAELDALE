/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author E104
 */
import java.util.Scanner;
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion = 0 ;
        
        
        Scanner leer = new Scanner(System.in);
       
       funcionalidades option = new funcionalidades();
       Menu_inicializacion menu = new Menu_inicializacion();
       
       menu.mostrarmenu(opcion);
       opcion = leer.nextInt();
       option.elgir(opcion);
       
    }
    
}
