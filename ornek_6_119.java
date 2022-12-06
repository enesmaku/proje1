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

public class ornek_6_119 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int s =  1;
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print(s+"\t");
                                s++;
                        }

                        System.out.println("");
                }

        }

}