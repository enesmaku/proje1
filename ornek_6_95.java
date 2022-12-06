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

public class ornek_6_95 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("x gir:");
                int x = scannerInput.nextInt();
                System.out.print("y gir:");
                int y = scannerInput.nextInt();
                for(int i=2;i<=x;i++){
                        for(int j=2;j<=y;j++){
                                System.out.println(Math.pow(i,j)+Math.pow(j,i));
                        }

                }

        }

}