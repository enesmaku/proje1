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

public class ornek_6_72 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                int BS =  (int)(Math.random()*(99-1+1)+1);
                int S =  0;
                int tahmin =  0;
                while(tahmin!=BS){
                        System.out.print("tahmin gir:");
                        tahmin = scannerInput.nextInt();
                        if(tahmin>BS){
                                System.out.println("daha kucuk sayi gir");
                        }

                        else if(tahmin<BS){
                                System.out.println("daha buyuk sayi gir");
                        }

                        S+=1;
                }

                System.out.println(S+". tahminde buldun");
        }

}