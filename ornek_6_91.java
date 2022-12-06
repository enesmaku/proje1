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

public class ornek_6_91 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("s gir:");
                int s = scannerInput.nextInt();
                int t=0;
                for(int i=1;i<s;i++){
                        if(s%i==0){
                                t+=i;
                        }

                }

                if(s==t){
                        System.out.println("mukemmel sayi");
                }

                else{
                        System.out.println("mukemmel sayi degil");
                }

        }

}