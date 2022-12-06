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

public class ornek_6_118 {
        public static int delannoy(int m, int n) {
                if(m==0 || n==0){
                        return 1;
                }

                return delannoy(m-1,n)+delannoy(m-1,n-1)+delannoy(m,n-1);
        }

        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("m gir:");
                int m = scannerInput.nextInt();
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int d =  delannoy(m,n);
                System.out.println(d);
        }

}