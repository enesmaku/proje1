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

public class ornek_6_103 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("a gir:");
                int a = scannerInput.nextInt();
                int s = 0;
                double t =  0;
                for(int i=1;i<=a;i++){
                        if(a%i==0){
                                s+=1;
                                t+=(double)1/(double)i;
                        }

                }

                double ho = (double) s/t;
                if(ho==Math.abs(ho)){
                        System.out.println("ore sayisi");
                }

                else{
                        System.out.println("ore sayisi degil");
                }

        }

}
