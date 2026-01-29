/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

/**
 *
 * @author Gomer Dalawangbayan
 */
import java.util.Scanner;
public class Subtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number:");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter a number:");
        int num2 = scanner.nextInt();

        int result = num1-num2;
        
        System.out.println(num1 + " - " + num2 + " = " + result);

    }
    
}
