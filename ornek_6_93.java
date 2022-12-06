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

public class ornek_6_93 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                for(int i=1;i<=n;i++){
                        System.out.println((int)(i*Math.pow(2,i)+1));
                }

        }

}