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

public class ornek_6_113 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int f1 =  1;
                int f2 =  1;
                int s2 =  0;
                while(s2<n){
                        int f3 =  f1+f2;
                        f1 =  f2;
                        f2 =  f3;
                        int s1 =  0;
                        for(int i=2;i<f3;i++){
                                if(f3%i==0){
                                        s1++;
                                }

                        }

                        if(s1==0){
                                s2++;
                                System.out.println(f3);
                        }

                }

        }

}