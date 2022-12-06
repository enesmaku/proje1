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

public class ornek_6_88 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                int a = scannerInput.nextInt();
                int b =  2;
                while(a>1){
                        if(a%b==0){
                                System.out.println(b);
                                a/=b;
                        }

                        else{
                                b++;
                        }

        }
       }
}