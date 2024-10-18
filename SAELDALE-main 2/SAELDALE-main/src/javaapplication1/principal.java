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
         String tipodate ="",nombre="",contraseña="";
        int telefono =0 ;
        String lugareside="";


        Scanner leer = new Scanner(System.in);

       funcionalidades option = new funcionalidades();
       Menu_inicializacion menu = new Menu_inicializacion();
       SingUp crearcuenta = new SingUp();

       menu.mostrarmenu(opcion);
       opcion = leer.nextInt();
       option.elgir(opcion);
        if (opcion == 1) {
            System.out.print("Ingrese tipo de dato: ");
            tipodate = leer.next();
            System.out.print("Ingrese nombre: ");
            nombre = leer.next();
            System.out.print("Ingrese contraseña: ");
            contraseña = leer.next();
            System.out.print("Ingrese teléfono: ");
            telefono = leer.nextInt();
            System.out.print("Ingrese lugar de residencia: ");
            lugareside = leer.next();
        }
       crearcuenta.entradadate(tipodate,nombre,contraseña,telefono,lugareside);

    }

}
