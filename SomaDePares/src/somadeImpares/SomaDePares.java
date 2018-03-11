/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package somadeImpares;
import java.util.Scanner;

public class SomaDePares {

     public static void main(String[] args) 
    {
       Scanner valor = new Scanner(System.in);
      
       System.out.println("Digite de o n° inicial e o n° final para a soma dos ímpares");
       
       int soma =0;
        System.out.println("N° inicial");
      int in = valor.nextInt(); 
       System.out.println("N° final");
      int fi = valor.nextInt();
        for (int i = in; i < fi; i++)
       {
           
       if (i % 2 ==1)
       {
           soma =i+soma;
       }

      }
        
       System.out.println( " soma dos ímpares: "+soma);
        
    }
}
