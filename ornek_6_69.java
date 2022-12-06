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

public class ornek_6_69 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("x gir:");
                int x = scannerInput.nextInt();
                System.out.print("N gir:");
                int n = scannerInput.nextInt();
                double T = (double) 1;
                for(int i=1;i<n-1;i++){
                        int F =  1;
                        for(int j=1;j<2*i;j++){
                                F =  F*j;
                        }

                        T+=(Math.pow(-1,i)*Math.pow(x,2*i))/(double)F;
                }

                System.out.println(T);
        }

}