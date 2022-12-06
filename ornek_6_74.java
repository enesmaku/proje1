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

public class ornek_6_74 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("x gir:");
                int x = scannerInput.nextInt();
                System.out.print("N gir:");
                int N = scannerInput.nextInt();
                double T = (double) 1;
                int F =  1;
                for(int i=1;i<N-1;i++){
                        F =  F*i;
                        T+=Math.pow(x,i)/F;
                }

                System.out.println(T);
        }

}