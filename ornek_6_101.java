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

public class ornek_6_101 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("N gir:");
                int n = scannerInput.nextInt();
                for(int i=1;i<=n;i++){
                        int s =  0;
                        for(int j=1;j<=i;j++){
                                if(i%j==0){
                                        s++;
                                }

                        }

                        if(i%s==0){
                                System.out.println(i);
                        }

                }

        }

}