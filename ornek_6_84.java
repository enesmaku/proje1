/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author sasni
 */
import java.util.Scanner;

public class ornek_6_84 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                double a = scannerInput.nextDouble();
                double b = (double)a*(1+Math.pow(5,0.5))/(double)2;
                System.out.println(a+" "+b);
        }

}