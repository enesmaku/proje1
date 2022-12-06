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
public class ornek_6_98 {
        public static void main(String[] args) {

                for(int i=1;i<=9;i++){
                        for(int j=0;j<=9;j++){
                                for(int k=0;k<=9;k++){
                                        int s =  100*i+10*j+k;
                                        if(s==Math.pow(i,3)+Math.pow(j,3)+Math.pow(k,3)){
                                                System.out.println(s);
                                        }

                                }

                        }

                }

        }

}