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

public class ornek_6_71 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double t = 0;
                for(int k=0;k<n-1;k++){
                        t+=(double)1/(double)((2*k+1)*(2*k+2));
                }

                System.out.println(t);
        }

}