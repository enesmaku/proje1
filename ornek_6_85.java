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

public class ornek_6_85 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("u gir:");
                double u = scannerInput.nextDouble();
                double b = (double) u/(2+Math.pow(2,0.5));
                double a = (double) u-b;
                System.out.println(a+" "+b);
        }

}