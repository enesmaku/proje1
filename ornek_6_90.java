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

public class ornek_6_90 {
        public static void main(String[] args) {
                Scanner scannerInput = new Scanner(System.in);
                System.out.print("n gir:");
                int n = scannerInput.nextInt();
                int s =  0;
                int[] o=new int[n];
                for(int i=3;i<=n;i++){
                        int k =  0;
                        for(int j=2;j<i;j++){
                                if(i%j==0){
                                        k++;
                                }

                        }

                        if(k==0){
                                s++;
                                o[s]=i;
                        }

                }
                for (int i = 1; i <s; i++) {
                    if(o[i+1]-o[i]==2){
                        System.out.println(o[i]+" "+o[i+1]);
                    }
                }

        }

}