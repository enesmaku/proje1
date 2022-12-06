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

public class ornek_6_96 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("s gir:");
                int s = scannerInput.nextInt();
                if((s-1)%4==0){
                        System.out.println("hilbert sayisi");
                }

                else{
                        System.out.println("degil");
                }

        }

}