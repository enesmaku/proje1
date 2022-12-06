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

public class ornek_6_102 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("N gir:");
                int n = scannerInput.nextInt();
                for(int a=1;a<=n;a++){
                        System.out.println(a+" "+(a+1)+" "+(a*(a+1)));
                }

        }

}
