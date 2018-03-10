/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.algo;

/**
 *
 * @author clemss
 */
public class Exercice10 {
    
    public static void launch() {
        
        long a = 0;
        long b = 1;
        long tamp;
        
       
        for ( int i =0; i < 100 ; i++){
            
            tamp = a +b;
            
            a = b;
            
            b = tamp;
            
            System.out.println(tamp);
            
        }
    }
    
}
