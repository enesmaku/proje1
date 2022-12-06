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

public class ornek_6_92 {
            public static Boolean asal( int sayi ) {
                int s =  0;
                for(int i=2;i<sayi;i++){
                        if(sayi%i==0){
                                s+=1;
                        }

                }
                return s==0;
        }
            
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                for(int i=1;i<=n;i++){
                        int a = (int) Math.pow(2,i);
                        int b = (int)(Math.pow(2,i+1))-1;
                        if(asal(b)){
                                System.out.println(a*b);
                        }

                }

        }

}
