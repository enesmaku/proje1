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

public class ornek_6_73 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                int X =(int)(Math.random()*(90-65+1)+65);
                for(int i=1;i<10;i++){
                        System.out.print("tahmin gir:");
                        char tahmin = scannerInput.next().charAt(0);
                        if(tahmin==(char)X){
                                System.out.println(i+". tahminde buldun");
                                break;
                        }

        }
        }
}