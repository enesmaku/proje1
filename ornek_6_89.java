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

public class ornek_6_89 {
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
                if(!asal(n)){
                        System.out.println("sayi asal degil");
                }

                else{
                        if(asal(n+2)){
                                System.out.println("chen asali");
                        }

                        else{
                                System.out.println("chen asali degil");
                        }

                }

        }

}