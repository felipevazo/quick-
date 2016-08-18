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
    
    
    
    
    public static void buscarmayor(int matriz[][])
    {   int tope=0;
        int i,j;
        i=0;
        int numayor=0;
        int jmayor,imayor;
        do
        {
            j=0;
            do
            {
                if (numayor<matriz[i][j])
                {
                    numayor=matriz[i][j];
                    jmayor=j;
                    imayor=i;
                    j=j+1;
                }
                i=i+1;
            }
            while(j<tope*tope);
        }
        while(i<tope);
    
       
          
    }
}
