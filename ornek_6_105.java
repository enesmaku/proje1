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

public class ornek_6_105 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                int a = scannerInput.nextInt();
                int t =  0;
                int s =  0;
                for(int i=1;i<=a;i++){
                        if(a%i==0){
                                t+=i;
                                s+=1;
                        }

                }

                if((double)t/(double)s==t/s){
                        System.out.println("aritmetik sayi");
                }

                else{
                        System.out.println("degil");
                }

        }

}
