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

public class ornek_6_77 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double t = (double) 0;
                for(int k=0;k<n-1;k++){
                        t+=Math.pow(-1,k)/Math.pow(((2*k+1)*3),k);
                }

                System.out.println(Math.pow(12,((double)1/(double)2)*t));
        }

}