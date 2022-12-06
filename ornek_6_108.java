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

public class ornek_6_108 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("m gir:");
                int m = scannerInput.nextInt();
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                double t = (double) Math.pow(n+1,m);
                for(int i=1;i<=n;i++){
                        int f1 =  1;
                        int f2 =  1;
                        int f3 =  1;
                        for(int k=1;k<=m+1;k++){
                                f1*=k;
                        }

                        for(int k=1;k<i;k++){
                                f2*=k;
                        }

                        for(int k=1;k<=m+1-i;k++){
                                f3*=k;
                        }

                        double c = (double) (double)f1/(double)(f2*f3);
                        t+=Math.pow(-1,i)*c*Math.pow((n+1-i),m);
                }

                System.out.println(t);
        }

}
