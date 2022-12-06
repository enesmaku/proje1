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

public class ornek_6_75 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("x gir:");
                double x = scannerInput.nextDouble();
                System.out.print("n gir:");
                double n = scannerInput.nextDouble();
                double sonuc = (double) Math.pow((1+x/n),n);
                System.out.println(sonuc);
        }

}