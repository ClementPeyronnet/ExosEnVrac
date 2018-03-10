/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.beziers.programmation.exosEnVrac.algo;

import java.util.Arrays;

/**
 *
 * @author clemss
 */
public class Exercice6 {
    
    public static void launch() {
        
        boolean [] Tableau = new boolean[10];
        
        for(int vrai = 0; vrai < 10; vrai++){
            
            Tableau [vrai]= true;
            System.out.println(Tableau [vrai]);
        }
        
        for (int faux = 0 ; faux <10 ; faux++) {
            
            Tableau [faux] = false;
            System.out.println(Tableau [faux]);
        }
        
        for (int pasTouche = 0 ; pasTouche <10 ; pasTouche++) {
            
            Tableau [pasTouche] = false;
            System.out.println(Tableau [pasTouche]);
        }
    }
    
}
