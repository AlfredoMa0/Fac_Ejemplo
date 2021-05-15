/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fac_ejem;

import javax.swing.JOptionPane;


/**
 *
 * @author Campe
 */
public class Fac_Ejem {

   /**
    * 
    * @param args SACAR LA FACTORIAL DE UN NUMERO INGRESADO POR TECLADO
    */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial=1;
        int numero;
        int i=1;

       numero= Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN "
               + "VALOR:"));
        
        System.out.println("!= " + numero);
        
        while (i<=numero) {
            factorial = factorial * i;
            if (i<numero) {
                System.out.println(i+"X:");
            }else {
                System.out.println(i);
              } 
            i = i + 1;
        }
        System.out.println(" EL FACTORIAL DE " + numero + " ES :" + factorial);
    }
    
}
