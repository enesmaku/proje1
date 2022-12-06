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

public class ornek_6_120 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                for(int a=1;a<n;a++){
                        for(int b=a+1;b<=n-a;b++){
                                int c =  n-(a+b);
                                if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                                        System.out.println(a+" "+b+" "+c+" "+(a*b*c));
                                }

                        }

                }

        }

}