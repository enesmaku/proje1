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

public class ornek_6_97 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                int a = scannerInput.nextInt();
                System.out.print("b gir:");
                int b = scannerInput.nextInt();
                int ta =  0;
                int tb =  0;
                for(int i=1;i<a;i++){
                        if(a%i==0){
                                ta+=i;
                        }

                }

                for(int i=1;i<b;i++){
                        if(b%i==0){
                                tb+=i;
                        }

                }

                if(ta==b && tb==a){
                        System.out.println("dost sayilar");
                }

                else{
                        System.out.println("dost sayilar degil");
                }

        }

}