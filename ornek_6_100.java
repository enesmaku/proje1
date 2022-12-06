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

public class ornek_6_100 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("s gir:");
                int s = scannerInput.nextInt();
                int t =  0;
                for(int i=1;i<=s;i++){
                        if(s%i==0){
                                t+=i;
                        }
                }
                if(t<2*s){
                        System.out.println("eksik sayi ve miktari: "+(2*s-t));
                }

                else{
                        System.out.println("eksik sayi degil");
        }
       }
}