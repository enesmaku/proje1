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

public class ornek_6_116 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("f2 gir:");
                int f2 = scannerInput.nextInt();
                double ao = (double) (1+Math.pow(5,0.5))/(double)2;
                int f1 =  (int)((double)f2/ao);
                int f3 =  (int)(f2*ao);
                System.out.println(f1+" "+f2+" "+f3);
        }

}
