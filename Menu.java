/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class Menu {
static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
     
    public static void menu()
    {
        int i=0;
        System.out.println("Bienvenido a ");
        System.out.println("Seleccione una de las siguientes utilidades para comenzar, ingrese el numero que corresponda.");
        do
        {
            System.out.println("1 para ");
            System.out.println("2 para ");
            System.out.println("3 para ");
            System.out.println("4 para ");
            i=entrada.nextInt();
            if(i<1||i>4)
            {
                System.out.println("Dato ingresado no valido, por favor intente nuevamente.");
            }
        }
        while(i<1||i>4);
    }
          
    
    
}


