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

public class ornek_6_110 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int k0 =  0;
                int k1 =  1;
                System.out.println(k1);
                for(int i=1;i<n;i++){
                        int k2 =   34*k1-k0+2;
                        System.out.println(k2);
                        k0 =  k1;
                        k1 =  k2;
                }

        }

}