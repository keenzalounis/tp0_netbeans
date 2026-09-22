/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author TRETEC
 */
public class Calculator {

    /**
     * @param args the command line arguments
     * Kenza LOUNIS , BDML1 groupe1, exo3 , 22/09/2026
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the operator");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        int operateur = sc.nextInt();
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: invalid operator!");
            System.exit(0);
        }
        
        System.out.println("Please enter the first number:");
        double operande1 = sc.nextDouble();
        
        System.out.println("Please enter the second number:");
        double operande2 = sc.nextDouble();
        
        double result = 0;
        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                if (operande2 == 0) {
                    System.out.println("Error: division by zero!");
                    System.exit(0);
                }
                result = operande1 / operande2;
                break;
            case 5:
                result = operande1 % operande2;
                break;
        }

        System.out.println("The result is: " + result);
    }
 

    
}
