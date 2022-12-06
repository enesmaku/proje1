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

public class ornek_6_76 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double t = (double) 2;
                for(int k=1;k<n;k++){
                        double f = (double) 1;
                        for(int j=1;j<=2*k+1;j++){
                                f*=j;
                        }

                        t+=(double)(2*k+2)/f;
                }

                System.out.println(t);
        }

}