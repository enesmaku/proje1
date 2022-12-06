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

public class ornek_6_114 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int f1 =  1;
                int f2 =  -1;
                System.out.print(f1+" "+f2+" ");
                for(int i=1;i<n-1;i++){
                        int f3 =  f1-f2;
                        System.out.print(f3+" ");
                        f1 =  f2;
                        f2 =  f3;
                }

        }

}