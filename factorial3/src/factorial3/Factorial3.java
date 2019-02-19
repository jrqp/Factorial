/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial3;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Factorial3 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println(String.format("El factorial de 3 es %f", factorial3(3)));
        System.out.println(String.format("El factorial de 7 es %f", factorial3(7)));
        System.out.println(String.format("El factorial de 35 es %f", factorial3(35)));

    }
public static double factorial3(long n)
    {
        if(n >=0 && n <= 100)
        {
            double fac=1;
            for (int i=1; i<n+1; i++)
            {
                fac = fac * i;
            }
            return fac;
        }
        else
        {
            return 0;
        }
}
        
        
        // TODO code application logic here
    }
     

