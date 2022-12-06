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

public class ornek_6_117 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int p1 =  0;
                int p2 =  1;
                System.out.print(p1+" "+p2+" ");
                for(int k=1;k<n;k++){
                        int p3 =  2*p2+p1;
                        System.out.print(p3+" ");
                        p1 =  p2;
                        p2 =  p3;
                }

        }

}
