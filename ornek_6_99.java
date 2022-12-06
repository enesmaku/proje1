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

public class ornek_6_99 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                int a = scannerInput.nextInt();
                System.out.print("b gir:");
                int b = scannerInput.nextInt();
                int a1 =  a/10;
                int a0 =  a%10;
                int b1 =  b/10;
                int b0 =  b%10;
                if(a1==b1 && a0+b0==10){
                        System.out.println("bagdasik sayilar");
                }

                else{
                        System.out.println("degil");
                }

        }

}