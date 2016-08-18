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
        int a=0;
        System.out.println("Bienvenido a ");
        do
        {
            System.out.println("Ingrese el numero correspondiente a lo que desee desplegar.");
            System.out.println("1 para ");
            System.out.println("2 para ");
            System.out.println("3 para ");
            System.out.println("4 para ");
            a=entrada.nextInt();
            if(a<1||a>4)
            {
                System.out.println("Opción ingresada no es valida, por favor intente nuevamente.");
            }
        }
        while(a<1||a>4);
          
    }
}
