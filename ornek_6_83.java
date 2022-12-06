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

public class ornek_6_83 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("ab gir:");
                double ab = scannerInput.nextDouble();
                double cb = (double) (double)(2*ab)/(double)(1+Math.pow(5,0.5));
                double ac = (double) ab-cb;
                System.out.println(ac+" "+cb);
        }

}