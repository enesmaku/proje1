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

public class ornek_6_78 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double c = 1;
                for(int k=1;k<n;k++){
                        int c1 =  4*k*k;
                        c = (double)(c*c1)/(double)(c1-1);
                }

                System.out.println(2*c);
        }

}