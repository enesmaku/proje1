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

public class ornek_6_81 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double t = (double) 1;
                for(int i=1;i<n-1;i++){
                        t =  1+((double)1/(2+(double)1/t));
                }

                System.out.println(1+((double)1/t));
        }

}