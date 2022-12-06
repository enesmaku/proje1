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

public class ornek_6_111 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int t1 =  1;
                int t2 =  1;
                System.out.print(t1+" "+t2+" ");
                for(int i=1;i<n-1;i++){
                        int t3 =  t1+t2;
                        System.out.print(t3+" ");
                        t1 =  t2;
                        t2 =  t3;
                }

        }

}